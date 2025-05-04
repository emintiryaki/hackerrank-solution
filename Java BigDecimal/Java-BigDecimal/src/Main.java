import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // stabil sıramala yapacağız.
        // Arrays.sort() stabil sıralama yapar. girdiler sıralanırken giriş sırası da göz önünde bulundurulur.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n+2];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        Arrays.sort(arr,0, n, (o1, o2) -> {
            BigDecimal bd1 = new BigDecimal(o1);
            BigDecimal bd2 = new BigDecimal(o2);
            return bd2.compareTo(bd1);
        });

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}