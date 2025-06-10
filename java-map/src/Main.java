// link: https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String , String> phoneBook = new HashMap<>();
        sc.nextLine(); // Consume the newline character after nextInt
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String phone = sc.nextLine();
            phoneBook.put(name, phone);
        }
        // local ortamda çalışırken hasNext sonsuz döngüde kalır...
        while (sc.hasNext()) {
            String query = sc.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}