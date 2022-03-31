class lamp
{
    boolean isOn;
    void turnOn()
    {
        isOn=true;
        System.out.println("The lamp is on? "+isOn);
    }
    void turnOff()
    {
        isOn=false;
        System.out.println("The lamp is on? "+isOn);
    }
}
class LampTurn
{
    public static void main(String args[])
    {
        lamp l1=new lamp();
        lamp l2=new lamp();
        l1.turnOn();
    }
}