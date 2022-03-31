import java.util.Scanner;
class a
{
    public static void main(String[] args)
    {
        int b;
        System.out.println("Enter any number: ");
        Scanner input=new Scanner(System.in);
        b=input.nextInt();
        Square result=new Square();
        result.sqr(b);
        System.out.println("The number 'a' is: "+result.a);
        int a[] = new int[5];
        a[0]=5;
        System.out.println(a[0]);
    }
}
class Square
{
    int a;
    public int sqr(int b)
    {
        System.out.println("The Square is: "+b*b);
        a=10;
        return 0;
    }
}