import java.util.*;

public class primecheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        PrimeChacker(n);
        obj.close();
    }

    public static void PrimeChacker(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
