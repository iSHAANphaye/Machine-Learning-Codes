import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    int[] arr;
	    for(int i=0;i<t;i++) {
	        int n=sc.nextInt();
	        arr=new int[n];
	        for(int j=0;j<n;j++) {
	            arr[j]=sc.nextInt();
	        }
	        if(arr.length == 1) {
	            System.out.println(arr[0]);
	        }
	        else if(arr.length == 2) {
	            Arrays.sort(arr);
	            System.out.println(arr[1]);
	        }
	        else {
	            Arrays.sort(arr);
	            int b1=arr[arr.length-1];
	            int b2=arr[arr.length-2];
	            for(int k=arr.length-3;k>=0;k--) {
	                if(b1<=b2) {
	                    b1=b1+arr[k];
	                }
	                else {
	                    b2=b2+arr[k];
	                }
	            }
	         if(b1>b2)
	         System.out.println(b1);
	         else
	         System.out.println(b2); 
	        }
	    }
	}
}