import java.util.*;
import java.io.*;
 
 
 
public class CoinPile{
     
     static PrintWriter out = new PrintWriter(System.out,true);
    public static void main(String [] args) throws Exception{
 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         StringBuilder sb = new StringBuilder();
 
         int t = Integer.parseInt(br.readLine());
 
            while(t-- > 0){
 
          String [] parts = br.readLine().split(" ");
 
          long a  = Long.parseLong(parts[0]); 
          long b  = Long.parseLong(parts[1]);  
 
   
    if((a + b ) %  3 == 0 &&  Math.min(a,b) * 2 >= Math.max(a,b)){
        sb.append("YES\n");
    }else{
        sb.append("NO\n");
    }
 
 
  }
 
      out.println(sb.toString());
 
    }
}
