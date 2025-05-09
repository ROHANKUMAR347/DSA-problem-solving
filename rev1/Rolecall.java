import java.util.*;

public class Rolecall {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int t = obj.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = obj.nextInt();
            int[] A = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                A[i] = obj.nextInt();
            }

            boolean[] called = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                if (!called[i]) {
                    int calledId = A[i];
                    if (calledId >= 1 && calledId <= n) {
                        called[calledId] = true;
                    }
                }
            }

            List<Integer> uncalledIDs = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (!called[i]) {
                    uncalledIDs.add(i);
                }
            }
            System.out.println(uncalledIDs.size());
            for (int id : uncalledIDs) {
                System.out.print(id + " ");
            }
            System.out.println();
            obj.close();
        }

    }
}
