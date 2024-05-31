import java.util.*;

public class Nge {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tc = obj.nextInt();
        while (tc-- > 0) {
            int n = obj.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            int[] ans = solve(arr, n);
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        obj.close();
    }

    public static int[] solve(int[] arr, int n) {
        int[] ans = new int[n];
        ans[n - 1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }
}
