import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int ans = recurshiveBs(arr, k, 0, n - 1);
        System.out.println(ans);
        obj.close();
    }

    public static int recurshiveBs(int[] arr, int k, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                return 1;
            } else if (arr[mid] < k) {
                return recurshiveBs(arr, k, mid + 1, high);
            } else {
                return recurshiveBs(arr, k, low, mid - 1);
            }
        }
        return -1;
    }
}
