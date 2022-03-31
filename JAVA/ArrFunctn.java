import java.util.Scanner;
public class ArrFunctn 
{
    public static int[] takeInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index of the array: ");
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
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] Inc(int input[])       
    {                                          
        input = new int[4];
        for(int i=0;i<input.length;i++)
        {
            input[i]+=1;
        }
        return input;
    }
    public static void main(String args[])
    {
        int arr[] = takeInput();
        arr=Inc(arr);
        printArray(arr);
        System.out.println("\n"+arr);  //prints the reference of arr//
    }
}
