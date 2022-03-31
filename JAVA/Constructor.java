class Company 
{
    String domainName;
    public Company()
    {
        domainName = "programiz.com";
    }
}
public class Constructor 
{    
    public static void main(String[] args) 
    {
        Company obj = new Company();
        System.out.println("Domain name = "+ obj.domainName);
    }
}