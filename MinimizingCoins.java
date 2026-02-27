import java.util.*;
import java.io.*;
 
public class MinimizingCoins{
    static PrintWriter out = new PrintWriter(System.out,true);
 
	public static void main(String [] args){
 
 
     Scanner  sc = new Scanner(System.in);
 
     int n = sc.nextInt();
     int amount =  sc.nextInt();
     int ans = 0;
     int [] a =  new int [n];
     for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
     }
 
 
    int [] dp = new int[amount + 1];
 
    Arrays.fill(dp,amount + 1);
 
    dp[0] = 0;
 
 
    for(int i = 1; i <= amount; i++){
    	for(int coin : a){
           if(i - coin >= 0){
           	dp[i] = Math.min(dp[i], dp[i - coin] + 1);
 
           }		
    	}
    }
 
 
       
     if(dp[amount] > amount){
     	out.println("-1");
     }else{
     	out.println(dp[amount]);
     }
 
 
	}

}
