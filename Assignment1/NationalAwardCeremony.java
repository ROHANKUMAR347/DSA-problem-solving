//Enter code here

import java.util.Scanner;

public class NationalAwardCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] winners = new int[n];

            for (int i = 0; i < n; i++) {
                winners[i] = scanner.nextInt();
            }

            arrangeMedals(winners, n);

            for (int i = 0; i < n; i++) {
                System.out.print(winners[i] + " ");
            }
            System.out.println();
        }
        scanner.close();

    }

    private static void arrangeMedals(int[] winners, int n) {
        int gold = 0, silver = 0, bronze = 0;

        for (int i = 0; i < n; i++) {
            if (winners[i] == 0) {
                gold++;
            } else if (winners[i] == 1) {
                silver++;
            } else {
                bronze++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (gold > 0) {
                winners[i] = 0;
                gold--;
            } else if (silver > 0) {
                winners[i] = 1;
                silver--;
            } else {
                winners[i] = 2;
                bronze--;
            }
        }
    }
}
