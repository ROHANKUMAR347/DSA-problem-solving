
import java.util.*;

public class Yellowandred {

    public static void main(String args[]) throws Exception {
        Scanner obj = new Scanner(System.in);

        int N = obj.nextInt();
        int Q = obj.nextInt();

        int[] yellowCards = new int[N + 1];
        boolean[] removed = new boolean[N + 1];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            int type = obj.nextInt();
            int player = obj.nextInt();

            if (type == 1) {
                if (!removed[player]) {
                    yellowCards[player]++;
                    if (yellowCards[player] == 2) {
                        removed[player] = true;
                    }
                }
            } else if (type == 2) {
                if (!removed[player]) {
                    removed[player] = true;
                }
            } else if (type == 3) {
                if (removed[player]) {
                    result.append("Yes\n");
                } else {
                    result.append("No\n");
                }
            }
        }

        System.out.print(result.toString());
        obj.close();
    }
}
