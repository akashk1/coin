
import java.util.*;
 
class CoinChange
{
    static long countWays(int S[], int m, int n)
    {
       
        long[] table = new long[n+1];
 
       
        Arrays.fill(table, 0);  
 
       
        table[0] = 1;
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
 
        return table[n];
    }
 
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
    
        int m =sc.nextInt();
        int n =sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
        System.out.println(countWays(a,n ,m));
    }
}