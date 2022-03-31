import java.util.Scanner;
class Dog
{
    int legs;
    String Breed;
    Dog(int legs)
    {
        this.legs = legs;   //"this" keyword references to the current object, which is initialized earliest
    }
    Dog(int legs, String Breed)
    {
        this.legs=legs;
        this.Breed=Breed;
    }
    public void hey()
    {
        System.out.println("Say hi to my dog...");
    }
    
}
public class method
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Max number is: "+maxOf(a,b));
        sayHi();
        Dog dog = new Dog(4);
        Dog dog2 = new Dog(5);
        Dog dog3 = new Dog(3, "Huskey");
        dog.hey();
        System.out.println(dog.legs+" and "+dog2.legs);
        System.out.println("The 3rd dog has "+dog3.legs+" legs and is of the "+dog3.Breed+" breed.");
    }
    public static int maxOf(int a, int b)
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
    public static void sayHi()
    {
        System.out.println("Hello my name is Ishaan Phaye");
    }
}
