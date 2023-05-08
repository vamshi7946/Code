class Base
{
    protected String a,b;
    public Base(String i, String j)
    {
        a=i;
        b=j;
    }
    public void show()
    {
        System.out.println("A = "+a+"\nB = "+b);
    }
}
class Child extends Base
{
    String c;
    Child(String i, String j, String k)
    {
        super(i,j);
        c=k;
    }
    public void show()
    {
        super.show();
        System.out.println("C= "+c);
    }
}
class MethodOverriding
{
    public static void main(String args[])
    {
        Child c = new Child("Ichigo","Eren Yeager","Asta");
        c.show();
    }
}