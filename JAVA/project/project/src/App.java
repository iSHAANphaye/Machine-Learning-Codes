import Calender.Calender;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int x,y;
        System.out.println("Hello, World!");
        Calender a = new Calender();
        a.Hey();
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        System.out.println("The max number is: "+maxOf(x,y));
    }
    static int maxOf(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        } 
    }
}
