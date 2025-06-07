import java.util.Scanner;

// link : https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true

// sorunun çözümünde graph search ( depth-first search ) algoritması kullanılmıştır.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            int leap = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            boolean winFlag = canWin(arr, leap);
            System.out.println(winFlag ? "YES" : "NO");
        }
    }

    private static boolean canWin(int[] arr, int leap) {
        if (leap >= arr.length) {
            return true;
        }
        return dfs(0, leap, arr, new boolean[arr.length]);
}

    private static boolean dfs(int i, int leap, int[] game, boolean[] visited) {
        if (i >= game.length) {
            return true;
        }
        if (i < 0 || visited[i] || game[i] == 1) {
            return false;
        }
        visited[i] = true;
        return dfs(i + leap, leap, game, visited) ||
                dfs(i + 1, leap, game, visited) ||
                dfs(i - 1, leap, game, visited);
    }
    }