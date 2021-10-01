import java.io.*;
import java.util.*;

public class Solution {
static boolean subset_arrays(int a[], int b[],
int m, int n)
{ 
int i = 0;
int j = 0;
for (i = 0; i < n; i++)
{
for (j = 0; j < m; j++)
{
if(b[i] == a[j])
break;
}

if (j == m)
return false;
}

return true;

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
       
        
        
        if(subset_arrays(a,b,n,m))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
