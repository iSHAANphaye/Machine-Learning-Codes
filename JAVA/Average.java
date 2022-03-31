import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        // float a;
        // Scanner input=new Scanner(System.in);
        // System.out.print("Input any number:");
        // a=input.nextFloat();
        // System.out.println(a);
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int n=input.nextInt();
        int marks[]=new int[n];
        System.out.print("Enter their marks: ");
        double average=0;
        for(int i=0; i<n; i++)
        {
           marks[i]=input.nextInt();
           average+=marks[i];
        }
        average/=n;
        System.out.println("The average marks of the class is: "+average);
    }
}