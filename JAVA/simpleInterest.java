import java.util.Scanner;
class simpleInterest
{
    public static void main(String[] args)
    {
        System.out.println("Enter the respective principle amount, the rate of interest and the time for which the final amount is to be calculated: ");
        
        int a;
        System.out.print("Principle is: ");
        Scanner principle = new Scanner(System.in);
        a = principle.nextInt();
        System.out.println(a);

        float b;
        System.out.print("Rate is= ");
        Scanner rate = new Scanner(System.in);
        b = rate.nextFloat();
        System.out.println(b);

        int c;
        System.out.print("Time is= ");
        Scanner time = new Scanner(System.in);
        c = time.nextInt();
        System.out.println(c);

        float finalAmount = a*b*c/100;
        System.out.print("The final amount will be: " + finalAmount);
    }
}