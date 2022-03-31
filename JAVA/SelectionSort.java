import java.util.Scanner;
public class SelectionSort 
{
    public static void main(String args[])
    {
        int a[] = {4,6,2,3,7,1,5};
        selectionSort(a);
        printArray(a);
    }

    public static void selectionSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int x=i;x<a.length;x++)
            {
                if(a[x]<min)
                {
                    min=a[x];
                    minIndex=x;
                }
            }
            int temp = a[minIndex];
            a[minIndex] =a[i];
            a[i] = temp;
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
