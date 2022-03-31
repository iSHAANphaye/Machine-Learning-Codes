import java.util.*;
public class Calender
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        System.out.println("The current date is: "+c.getTime()+" "+c.get(Calendar.DATE));
        c.add(Calendar.MONTH, 2);
        System.out.println("The date 2 months from now is: "+c.getTime());
    }
}