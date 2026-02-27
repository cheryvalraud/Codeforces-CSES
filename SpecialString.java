import java.util.*;
import java.io.*;

public class SpecialString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            sc.nextLine();


            String s = sc.nextLine();


            StringBuilder sb = new StringBuilder(s);


            while (deleteOneAdjacentPair(sb)) {
            }


            if (sb.length() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean hasAdjacentPair(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean deleteOneAdjacentPair(StringBuilder sb) {
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1)) {
                sb.delete(i - 1, i + 1);
                return true;
            }
        }
        return false;
    }


}
