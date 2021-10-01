import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int m=a[0];
        if(n==1)
        {
          System.out.println(m);  
        }
        else{
        for(int i=0;i<(n/2);i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        System.out.println(m);
        }
    }
}
