import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        // BigInteger sınıfında bulunan isProbablePrime methodu kullanılcak. bu method yaklaşık olarak sayının asal olup olmadığını kontrol eder.
        // içerisine certainity değeri alır. buraya verdiğimiz değer ne kadar büyük olursa sonuç o kadar kesin olmaya yaklaşır.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger bigInt = new BigInteger(n);
        boolean isPrime = bigInt.isProbablePrime(100);
        System.out.println(isPrime ? "prime" : "not prime");
    }
}