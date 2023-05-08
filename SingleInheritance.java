class Box
{
    protected double l,w,h;
    public Box()
    {
        l=w=h=-1;
    }
    public Box(double l, double w, double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }
    public void getDimensions()
    {
        System.out.println("Length = "+l+"\nWidth = "+w+"\nHeight = "+h);
    }
    public double volume()
    {
        return l*w*h;
    }
}
class Cube extends Box
{
    Cube()
    {
        //super();
    }
    Cube(double side)
    {
        l=w=h=side;
    }
    
}
public class SingleInheritance
{
    public static void main(String args[])
    {
        Box b = new Box();
        System.out.println("Default dimensions are :");
        b.getDimensions();
        System.out.println("Deault volume : "+b.volume());
        Box b1 = new Box(2,3,4);
        System.out.println("Dimensions of box are :");
        b1.getDimensions();
        System.out.println("volume of box : "+b1.volume());
        Cube c = new Cube();
        System.out.println("Default dimensions of cube are :");
        c.getDimensions();
        System.out.println("Deault volume of cube : "+c.volume());
        Cube c1 = new Cube(5);
        System.out.println("Dimensions of Cube are :");
        c1.getDimensions();
        System.out.println("volume of cube: "+c1.volume());

    }
}