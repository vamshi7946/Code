class Box
{
    public double length,width,height;
    Box()
    {
        length=10;
        width=12;
        height=10;
    }
    Box(Box obj)
    {
        length=obj.length;
        width=obj.width;
        height=obj.height;
    }
    public double volume()
    {
        return length*width*height;
    }
}
public class CopyConstructor
{
    public static void main(String args[])
    {
        Box b = new Box();
        System.out.println("Volume of box using default constructor: "+b.volume());
        Box b1=new Box(b);
        System.out.println("Volume of box using Copy constructor: "+b1.volume());
        b1.length=5;
        b1.width=2;
        b1.height=10;
        System.out.println("Volume of box using Copy constructor: "+b1.volume());

    }
}