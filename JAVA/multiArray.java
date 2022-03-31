import java.util.Scanner;
class multiArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
        {
           System.out.println(a[i][j]);
        }
        System.out.println();
        }
    }
}