import java.util.*;

public class Warofminus {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = obj.nextInt();
        String str = obj.next();
        obj.close();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        if (st.isEmpty()) {
            sb.append(-1);
        }

        else {
            while (!st.isEmpty()) {
                sb.append(st.pop());
            }
            sb.reverse();
        }
        System.out.println(sb);
    }

}
