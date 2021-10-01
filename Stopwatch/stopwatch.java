import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       if(n%2==1)
       {
           System.out.println("still running");
       }
       else
       {
           int timeNoted=0;
           for(int i=0;i<n;i++)
           {
               if(i%2==1)
               {
                   timeNoted+=(arr[i]-arr[i-1]);
               }
           }
           System.out.println(timeNoted);
       }
    }
}
