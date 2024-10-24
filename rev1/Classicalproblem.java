import java.util.*;

class Classicalproblem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int tc = obj.nextInt();
        while (tc-- > 0) {
            String str = obj.next();
            boolean isTrue = balance(str);
            if (isTrue) {
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }
        }
        obj.close();
    }

    public static boolean balance(String str) {
        int n = str.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                if (st.isEmpty()) {
                    return false;
                }
                char out = st.pop();
                if (ch == ')' && out != '(') {
                    return false;
                }
                if (ch == '}' && out != '{') {
                    return false;
                }
                if (ch == '}' && out != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}