
import java.util.*;

public class Duplicatedistance {
    public static void main(String args[]) throws Exception {
        // BufferedReader
        Scanner obj = new Scanner(System.in);
        int tc = obj.nextInt();
        while (tc-- > 0) {
            int n = obj.nextInt();
            int k = obj.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            if (hasDuplicates(arr, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        obj.close();
    }

    public static boolean hasDuplicates(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            if (map.containsKey(currentValue)) {
                int previousIndex = map.get(currentValue);
                if (i - previousIndex <= k) {
                    return true;
                }
            }

            map.put(currentValue, i);
        }

        return false;
    }
}
