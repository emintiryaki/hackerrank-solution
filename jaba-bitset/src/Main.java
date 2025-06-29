//link: https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true

import java.util.BitSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (index1 == 1) {
                        bitSet1.and(bitSet2);
                    } else {
                        bitSet2.and(bitSet1);
                    }
                    break;
                case "OR":
                    if (index1 == 1) {
                        bitSet1.or(bitSet2);
                    } else {
                        bitSet2.or(bitSet1);
                    }
                    break;
                case "XOR":
                    if (index1 == 1) {
                        bitSet1.xor(bitSet2);
                    } else {
                        bitSet2.xor(bitSet1);
                    }
                    break;
                case "FLIP":
                    if (index1 == 1) {
                        bitSet1.flip(index2);
                    } else {
                        bitSet2.flip(index2);
                    }
                    break;
                case "SET":
                    if (index1 == 1) {
                        bitSet1.set(index2);
                    } else {
                        bitSet2.set(index2);
                    }
                    break;
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }
}