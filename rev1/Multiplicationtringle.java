
import java.util.*;

class Multiplicationtringle {
    public static void main(String args[]) throws Exception {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        obj.close();
    }
}
