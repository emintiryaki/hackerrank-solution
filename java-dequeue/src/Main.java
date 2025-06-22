//link: https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements in the deque
        int m = sc.nextInt(); // size of the subarray

        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            // verilen m değerinde kaç farklı eleman olduğunu kontrol et
            // eğer deque boyutu m'ye ulaştıysa, max değerini güncelle
            // ve deque'den ilk elemanı çıkar. yeni bir subarray oluşturulacak.
            if (deque.size() == m) {
                max = Math.max(max, map.size());

                int removed = deque.removeFirst();
                int count = map.get(removed);
                if (count == 1) {
                    map.remove(removed);
                } else {
                    map.put(removed, count - 1);
                }
            }
        }

        System.out.println(max);
    }
}