import java.util.Scanner;
import java.lang.String;
class Forloop
{
  public static void main(String[] args)
  {
    String cars="i10,WagonR,Veyron,Mustang,Scorpio";
    String allCars[]=cars.split(",");
    for(String a:allCars)
    {
      System.out.println(a);
    }
  }
}