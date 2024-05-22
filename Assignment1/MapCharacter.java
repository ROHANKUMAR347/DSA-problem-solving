import java.util.*;

public class MapCharacter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        mapcharactercount(n);
        obj.close();
    }

    public static void mapcharactercount(int n) {
        String str = "abcdefghijklmnopqrstuvwxyz";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, i + 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i) + "-" + map.get(str.charAt(i)));
        }
    }
}
