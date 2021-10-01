import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int next = -1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    next = a[j];
                    break;
                }
            }
            System.out.print(next+" ");
        }
            
                
          
    }
}
