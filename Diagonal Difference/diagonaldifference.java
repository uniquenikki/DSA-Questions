import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
    
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
       int[][] mat = new int[n][n];
       for(int i= 0; i<n ; i++)
       {
           for(int j=0;j<n;j++)
           {
               mat[i][j]=sc.nextInt();
           }
       }
       int d1=0;
       int d2=0;
       for(int i= 0; i<n ; i++)
       {
           d1+=mat[i][i];
           d2+=mat[i][n-1-i];
       }
    // System.out.println(d1);
    // System.out.println(d2);
    int ans=d1-d2;
    if(ans<0)
    {
        System.out.println(-(ans));
    }
    else
    {
        System.out.println(ans);
    }
    }
}
