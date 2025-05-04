import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    5. test de hata veriyor. muhtemelen test de hata var. testten geçen bir çözüm incelendiğinde
    (a,b) == (b,a) varsayımıyla yapılmış. bu senaryo soruya aykırı.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String combined = pair_left[i] + "###" + pair_right[i];
            set.add(combined);
            System.out.println(set.size());
        }
    }
}