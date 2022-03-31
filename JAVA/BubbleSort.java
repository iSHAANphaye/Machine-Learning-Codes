import java.util.Scanner;
public class BubbleSort 
{
    public static void main(String args[])
    {
        int a[] = {4,6,2,3,7,1,5};
        System.out.println(a[a.length-1]);
        bubbleSort(a);
        printArray(a);
    }

    public static void bubbleSort(int a[])
    {
        for(int x = 0;x<a.length-1;x++)
        {
            for(int i = 0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
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
