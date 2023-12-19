
//Enter code here
import java.util.Scanner;

class question1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tc = obj.nextInt();
        while (tc-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }

            int[] ans = productExpetSelf(n, arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();

        }
        obj.close();
    }

    public static int[] productExpetSelf(int n, int[] nums) {

        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }
}