import java.util.Scanner;
class String_reverse
{
    public static void main(String args[])
    {
        String s,a;
        String YES="yes";
        Scanner input =new Scanner(System.in);
        s=input.nextLine();
        System.out.println("The string that you entered is: ");
        System.out.println("\""+s+"\"");
        System.out.println("The reverse of this string is: ");
        String arr[]=s.split(" ");
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}