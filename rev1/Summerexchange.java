
import java.util.*;

class Summerexchange {
    public static void main(String args[]) throws Exception {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            System.out.println(canExchange(n, arr) ? "YES" : "NO");
        }
        obj.close();
    }

    public static boolean canExchange(int n, int[] arr) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 5) {
                five++;
            } else if (arr[i] == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (arr[i] == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
