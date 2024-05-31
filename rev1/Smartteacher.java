import java.util.*;

public class Smartteacher {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        obj.nextLine();

        for (int i = 0; i < t; i++) {
            int n = obj.nextInt();
            obj.nextLine();
            String str1 = obj.nextLine();
            String str2 = obj.nextLine();

            String finalStudentAnswer = solve(str1);
            String finalCorrectAnswer = solve(str2);

            if (finalStudentAnswer.equals(finalCorrectAnswer)) {
                System.out.println("CORRECT");
            } else {
                System.out.println("WRONG");
            }
        }
        obj.close();
    }

    public static String solve(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for (char ch : st) {
            res.append(ch);
        }

        return res.toString();
    }
}
