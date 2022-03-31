import java.util.Scanner;
class Patterns
{
    public static void main(String args[])
    {
        int prob;
        System.out.println("Select any integer from 1 to 5");
        Scanner input=new Scanner(System.in);
        prob=input.nextInt();
        switch(prob)
        {
        case 1:
            System.out.println("You chose 1!");
            break;
        case 2:
            System.out.println("You chose 2!");
            break;
        case 3:
            System.out.println("You chose 3!");
            break;
        case 4:
            System.out.println("You chose 4!");
            break;
        case 5:
            System.out.println("You chose 5!");
            break;
        default:
            System.out.println("Wow is it so difficult to choose a number between 1 and 5!!");
        }
    }
}