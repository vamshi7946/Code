class Box
{
    protected double l,w,h;
    Box()
    {
        l=w=h=-1;
    }
    Box(double l,double w, double h)
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
    public String toString()
    {
        return "1";
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
    public String toString()
    {
        System.out.println(super.toString());
        return "2";
    }
}
class Cuboid extends Cube
{
    Cuboid()
    {
        //super();
    }
    Cuboid(double l, double w, double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }
    public String toString()
    {
        System.out.println(super.toString());
        return "3";
    }
}
class MultiLevelInheritance
{
    public static void main(String args[])
    {
        Cube c = new Cube();
        c.getDimensions();
        System.out.println("default volume of cube is :"+c.volume());
        System.out.println(c);
        Cube c1 = new Cube(5);
        c1.getDimensions();
        System.out.println("volume of cube  is :"+c1.volume());
        System.out.println(c1);
        Cuboid cb= new Cuboid();
        cb.getDimensions();
        System.out.println("default volume of cuboid is :"+cb.volume());
        System.out.println(cb);
        Cuboid cb1 = new Cuboid(1,2,3);
        cb1.getDimensions();
        System.out.println("volume of cuboid is :"+cb1.volume());
        System.out.println(cb1);
    }
}