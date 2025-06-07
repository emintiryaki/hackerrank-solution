
//link: https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of lists
        List<List<Integer>> allList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt(); // Number of elements in the list
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt()); // Add elements to the list
            }
            allList.add(list); // Add the list to the collection of lists
        }
        int q = sc.nextInt(); // Number of queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt()-1; // List index
            int y = sc.nextInt()-1; // Element index
            if (x>=0 && x < allList.size() && y>=0 && y < allList.get(x).size()) {
                System.out.println(allList.get(x).get(y)); // Print the element at the specified index
            } else {
                System.out.println("ERROR!"); // Print error if indices are out of bounds
            }
        }
    }
}