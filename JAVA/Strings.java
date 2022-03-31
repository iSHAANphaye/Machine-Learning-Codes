import java.util.Scanner;
public class Strings 
{
    public static void main(String args[])
    {
        String str1 = "HELLO!";
        String str2=str1.indent(5);
        System.out.print(str2);
        System.out.println("MY NAME IS ISHAAN.");
        str1="HELLO";
        str2="E";
        System.out.println(str1.contains(str2));
        System.out.println(str1.substring(2,4));
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();  
        StrRev(str);
        Palindrome(str);
    }
    public static String StrRev(String str)
    {
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        return str;
    }
    public static String Palindrome(String str)
    {        
        System.out.println("");
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str.equals(str1))
        {
            System.out.println("Palindrome!");
        }
        else
        {
            System.out.println("Not Palindrome!");
        }
        return str1;
    }
}
