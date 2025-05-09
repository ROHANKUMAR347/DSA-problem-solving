
import java.util.*;;

public class Freqchar {
    public static void main(String args[]) throws Exception {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String str = obj.next();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int freq = map.getOrDefault(ch, 0);
            map.put(ch, freq + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        obj.close();
    }
}
