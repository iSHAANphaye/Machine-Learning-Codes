import java.util.*;
import java.lang.*;
import java.io.*;
class ATM
{
	public static void main (String[] args) 
	{
	 try{
	       Scanner input=new Scanner(System.in);
       int x=input.nextInt();
       Double y=input.nextDouble();
       if(x%5==0 && x>0 && x<=2000 && y>=0 && y<=2000)
       {
       y=y-(float)x;
       y=y-0.50f;
       System.out.printf("%.2f",y);
       }
       else{
           System.out.printf("%.2f",y);
       }
	 }
	 catch(Exception e){
	       return;
	 }
	}
}
