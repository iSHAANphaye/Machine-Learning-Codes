import java.util.Scanner;
public class SubString
{
    public static void main(String agrs[])
    {
        System.out.print("Enter a single word string: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        // for(int n=0;n<str.length();n++)
        // {
        //     for(int i=n;i<str.length();i++)
        //     {
        //         System.out.println(str.substring(n,i+1));
        //     }
        // }
        for(int len=1;len<=str.length();len++)
        {
            for(int start=0;start<=str.length()-len;start++)
            {
                int end=start+len-1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }
}
