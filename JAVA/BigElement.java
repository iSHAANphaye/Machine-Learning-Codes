import java.util.Scanner;
public class BigElement 
{
    public static int[] inputArray()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index of array, and then its elements:");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[])
    {
        System.out.println("The array elements are: ");
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            arr[i]+=1;
            System.out.println(arr[i]);
        }
    }

    public static int maxElement(int arr[])
    {
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x)
            {
                x=arr[i];
            }
        }
        return x;
    }

    public static void Inc(int a)
    {
        a++;
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int c=s.nextInt();
        Inc(c);
        int arr[] = inputArray();
        int r = maxElement(arr);
        System.out.println(r+" is the largest Element");
        printArray(arr);
    }
}
