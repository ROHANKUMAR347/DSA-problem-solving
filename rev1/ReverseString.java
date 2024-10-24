
import java.util.*;

class ReverseString {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int tc = obj.nextInt();
        while (tc-- > 0) {
            String str = obj.next();
            for (int i = str.length() - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                System.out.print(ch);
            }
            System.out.println();
        }
        obj.close();
    }

}
