class car 
{
    public static void main(String[] args) {
       /* int a=10,b=20;
        swap(a,b);
        System.out.println(a+" "+b);*/
        Dog dog=new Dog();
        Dog c=new Dog();
        c.legs=4;
        Dog d=new Dog();
        d.legs=3;
        swap(c,d);
        System.out.println(c.legs+" "+d.legs);
        swapDog(c,d);
        System.out.println(c.legs+" "+d.legs);
        walk();
        dog.run();
    }
    static void swap(Dog x, Dog y)
    {
        Dog temp=x;
        x=y;
        y=temp;
        System.out.println(x.legs+" "+y.legs);
    }
    static void swapDog(Dog dog, Dog dogg)
    {
        dog.legs=6;
        dogg.legs=8;
    }
    static void walk()
    {
        System.out.println("The Dog is walking");
    }
}
class Dog
{
    int legs;
    static void run()
    {
        System.out.println("The Dog is running!");
    }
}