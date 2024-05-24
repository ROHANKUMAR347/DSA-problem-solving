
import java.util.*;

public class Removeduplicate {

    public static void main(String args[]) throws Exception {
        Scanner obj = new Scanner(System.in);
        int tc = obj.nextInt();
        while (tc-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            int m = solve(n, arr);
            System.out.println(m);
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            obj.close();
        }
    }

    public static int solve(int n, int[] arr) {
        if (n == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];

            }

        }
        return j + 1;
    }
}
