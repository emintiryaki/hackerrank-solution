// link: https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String [] pairLeft = new String[n];
        String [] pairRight = new String[n];

        for (int i = 0; i < n; i++) {
            pairLeft[i] = s.next();
            pairRight[i] = s.next();
        }
        Set<String> uniquePairs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String pair1 = pairLeft[i] + " " + pairRight[i];
            String pair2 = pairRight[i] + " " + pairLeft[i];
            if(!uniquePairs.contains(pair1) && !uniquePairs.contains(pair2)){
                uniquePairs.add(pair1);
            }
            System.out.println(uniquePairs.size());
        }
    }
}