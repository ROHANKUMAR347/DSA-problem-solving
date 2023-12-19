//package DSA-problem-solving.Assignment1;

import java.util.Scanner;

class EqulibriumElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tc = obj.nextInt();
        while (tc-- > 0) {
            int n = obj.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }

            int ans = findEquilibrium(n, arr);
            System.out.println(ans);
        }
        obj.close();
    }

    public static int findEquilibrium(int n, int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        int rightSum = totalSum - arr[0];

        for (int i = 0; i < n - 1; i++) {
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
            rightSum -= arr[i + 1];
        }
        return -1;
    }
}
