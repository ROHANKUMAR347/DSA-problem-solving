import java.util.*;

public class AlanAndFrequency {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String str = obj.next();

        solve(n, str);
        obj.close();
    }

    public static void solve(int n, String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int freq = map.getOrDefault(ch, 0);
            map.put(ch, freq + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
