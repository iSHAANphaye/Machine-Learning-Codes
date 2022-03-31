import java.util.Scanner;
class printFormatting
{
    public static void main(String[] args)
    {
        System.out.printf("%d\n",10);
        System.out.printf("%f\n",10.1);
        System.out.printf("%c\n",'a');
        System.out.printf("%C\n",'a');
        System.out.printf("%s\n","hello");
        System.out.printf("%S\n","hello");
        System.out.printf("%s\n","hello my name is ishaan phaye");
        System.out.printf("%b\n",5<4);               //Boolean
        System.out.printf("%B\n",7>10);              //Boolean in uppercase
        System.out.printf("%b\n",null);              
        System.out.printf("%b\n","Ishaan is smart?");
        System.out.printf("%e\n",10023.423);   //Exponential form
        System.out.printf("%E\n",10023.423);   //Exponential in uppercase
        System.out.printf("%g\n",10023.423);
        System.out.printf("%o\n",10);        //Octal form
        System.out.printf("%x\n",10);        //Hexadecimal
        System.out.printf("%X\n",10);        //Hexadecimal in uppercase
        System.out.printf("%h\n","hello");     //Hashcode
        System.out.printf("%H\n","hello");     //Hashcode in uppercase
        System.out.printf("%a\n",10.12);        //Hexadecimal floating point
        System.out.printf("%A\n",10.12);        //Hexadecimal floating point in uppercase
    }
}