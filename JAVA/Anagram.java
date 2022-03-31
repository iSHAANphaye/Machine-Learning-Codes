import java.util.Scanner;
class Anagram
{
    public static void main(String agrs[])
    {
        Scanner input=new Scanner(System.in);
        String a=input.next();
        String b=input.next();
        boolean isAnagram=false;
        boolean visited[]=new boolean[a.length()];
        if(a.length()==b.length())
        {
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            isAnagram=false;
            for(int j=0;j<b.length();j++)
            {
                if(b.charAt(j)==c && !visited[j])
                {
                    isAnagram=true;
                    break;
                }
            }
            if(!isAnagram)
            {
                break;
            }
        }
        if(isAnagram)
        {
            System.out.println("It is an Anagram!");
        }
        else
        {
            System.out.println("Try again...");
        }
        }
        else
        {
            System.out.println("Number of letters dont match!");
        }
    }
}