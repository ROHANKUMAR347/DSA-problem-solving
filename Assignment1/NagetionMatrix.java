
//package DSA-problem-solving.Assignment1;
import java.util.*;

public class NagetionMatrix {
    // Enter code here

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int m = obj.nextInt();
        int tSum = 0;

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = obj.nextInt();
                tSum += arr[i][j];
            }
        }
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = tSum - arr[i][j];
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        obj.close();

    }

}
