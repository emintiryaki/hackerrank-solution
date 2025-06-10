import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// link: https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int querySize = sc.nextInt();
        for (int i = 0; i < querySize; i++) {
            String command = sc.next();
            if (command.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (command.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}