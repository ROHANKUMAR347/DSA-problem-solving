import java.util.*;

class BinaryRepresentationtoNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String binary = convertBinary(n);
        System.out.println(binary);
        obj.close();
    }

    public static String convertBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }
}