import java.io.*;
import java.util.*;
 
public class TwoSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
 
        long n = Long.parseLong(br.readLine());
        long sum = n * (n + 1) / 2;
 
        if (sum % 2 != 0) {
            out.println("NO");
            return;
        }
 
        out.println("YES");
 
        long half = sum / 2;
        List<Long> set1 = new ArrayList<>();
        List<Long> set2 = new ArrayList<>();
 
        // Greedy: pick largest numbers first for set1 until sum = half
        for (long i = n; i >= 1; i--) {
            if (half >= i) {
                set1.add(i);
                half -= i;
            } else {
                set2.add(i);
            }
        }
 
        out.println(set1.size());
        for (long x : set1) out.print(x + " ");
        out.println();
 
        out.println(set2.size());
        for (long x : set2) out.print(x + " ");
        out.println();
    }
}
