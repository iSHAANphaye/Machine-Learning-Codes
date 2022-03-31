import java.util.Scanner;
public class BinSearch
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6};
        System.out.print("Input number to search in the array {1,2,3,4,5,6}: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int index = binSearch(a,n);
    }
    public static int binSearch(int a[], int n)
    {
        int s = 0;
        int e = a.length-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(a[m]>n)
            {
                e=m-1;
            }
            else if(a[m]<n)
            {
                s=m+1;
            }
            else if(a[m]==n)
            {
                System.out.println("Present!");
                break;
            }
        }
        return 0;
    }
}
