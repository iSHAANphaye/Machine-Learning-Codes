import java.util.Scanner;
public class test 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int x = 0;x < t;x++)
        {
        int N = s.nextInt();
        int M = s.nextInt();
        int arr[][] = new int[N][M]; 
        int a,b,i = 0;
        int c = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        for(a=0;a<N;a++)
        {
            for(b=0;b<M;b++)
            {
                arr[a][b] = s.nextInt();
            }
        }
        for(a=0;a<N;a++)
        {
            for(b=0;b<M;b++)
            {
                i+=arr[a][b];
            }
            if(i>sum)
            {
                sum=i;
                c=a;
            }
            i=0;
        }
        for(a=0;a<M;a++)
        {
            for(b=0;b<N;b++)
            {
                i+=arr[b][a];
            }
            if(i>sum)
            {
                sum=i;
                c=a;
            }
            i=0;
        }
        System.out.print("The max sum row/column of index "+c+" is: "+sum);
        }
    }
}
