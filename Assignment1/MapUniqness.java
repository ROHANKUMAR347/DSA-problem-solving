import java.util.*;

public class MapUniqness {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        while (n-- > 0) {
            String str = obj.next();
            solve(str);
        }

        obj.close();
    }

    public static void solve(String str) {
        boolean isTrue = true;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                isTrue = false;
            } else {
                map.put(ch, 1);
            }
        }
        if (isTrue) {
            System.out.println("UNIQUE");
        } else {
            System.out.println("No");
        }
    }
}
