class Demo
{
    public void sum()
    {
        System.out.println("NO Parameter are passed");
    }
    public void sum(int a, int b)
    {
        System.out.println("Sum of two integers : "+(a+b));
    }
    public void sum(int a, int b, int c)
    {
        System.out.println("Sum of three integers is : "+(a+b+c));
    }
    public void sum(double a, double b)
    {
        System.out.println("Sum of two double no.s : "+(a+b));
    }
}
class MethodOverloading
{
    public static void main(String args[])
    {
        Demo d = new Demo();
        d.sum();
        d.sum(5,6);
        d.sum(2,3,4);
        d.sum(2.0,5.2);
    }
}