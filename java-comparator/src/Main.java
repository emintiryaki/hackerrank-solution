import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

// link: https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true

//  çok daha kolay bir çözüm var ama bu soruda Comparator arayüzünü implement etmemiz isteniyor.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players[i] = new Player(name, score);
        }
        Checker checker = new Checker();
        for (int i = 0; i < n; i++) {
            Player key = players[i];
            int j = i - 1;
            while (j >= 0 && checker.compare(players[j], key) > 0) {
                players[j + 1] = players[j];
                j--;
            }
            players[j + 1] = key;
        }
        for (Player player : players) {
            System.out.println(player);
        }
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score != o2.score)
            return o2.score - o1.score;
        else
            return o1.name.compareTo(o2.name);
    }

    @Override
    public Comparator<Player> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Player> thenComparing(Comparator<? super Player> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Player> thenComparing(Function<? super Player, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Player> thenComparing(Function<? super Player, ? extends @NotNull U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Player> thenComparingInt(ToIntFunction<? super Player> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Player> thenComparingLong(ToLongFunction<? super Player> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Player> thenComparingDouble(ToDoubleFunction<? super Player> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}