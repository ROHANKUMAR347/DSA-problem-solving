import java.util.*;

public class Balancecharacter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tc = obj.nextInt();
        while (tc-- > 0) {
            int n = obj.nextInt();
            String str = obj.next();

            boolean isTrue = balanced(str, n);
            if (isTrue) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        obj.close();
    }

    public static boolean balanced(String str, int n) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                st.push(ch);
            } else if (Character.isUpperCase(ch)) {
                if (st.size() == 0 || st.pop() != Character.toLowerCase(ch)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
