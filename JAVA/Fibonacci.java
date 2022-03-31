import java.util.*;
public class Fibonacci 
{
    public static void main(String args[])
    {
        System.out.print("Enter the number of terms of series to print: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i<n;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        if(n == 2)
        {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
