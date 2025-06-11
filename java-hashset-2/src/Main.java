// link: https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// test case 5 de sorun var!!!

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        sc.nextLine(); // Consume the newline character after the integer input
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            set.add(s);
            System.out.println(set.size());
        }
    }
}