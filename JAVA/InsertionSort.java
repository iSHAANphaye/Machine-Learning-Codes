import java.util.Scanner;
import java.util.Arrays;
public class InsertionSort 
{
    public static void main(String args[])
    {
        int a[] = {4,6,2,3,7,1,5};
        insertionSort(a);
        printArray(a);
        int b[] = {12,14,16,13};
        int c[] = Arrays.copyOf(a,b);
    }
    public static void insertionSort(int a[])
    {
        int n = a.length;
        for(int i = 1;i<n;i++)
        {
            int j = i-1;
            int temp = a[i];
            while(j>=0 && a[j] > temp)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }

    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
