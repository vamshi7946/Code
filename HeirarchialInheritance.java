class Shape
{
    protected double l,b,r;
    Shape()
    {
        l=b=r=-1;
    }
    public void getDimensions()
    {
        System.out.println("Length = "+l+"\nBreadth = "+b+"\nRadius = "+r);    
    }
    public void area()
    {
        System.out.println("Area of shape :");
    }
}
class Square extends Shape
{
    Square(double len)
    {
        l=len;
    }
    public void area()
    {
        System.out.println("Area of square is :"+(this.l*this.l));
    }
}
class Rectangle extends Shape
{
    Rectangle(double length, double breadth)
    {
        this.l=length;
        this.b=breadth;
    }
    public void area()
    {
        System.out.println("Area of Rectangle is :"+(l*b));
    }
}
class Circle extends Shape
{
    Circle(double rad)
    {
        this.r=rad;
    }
    public void area()
    {
        System.out.println("Area of cicle is:"+(Math.PI*r*r));
    }
}
public class HeirarchialInheritance
{
    public static void main(String args[])
    {
        Shape s = new Shape();
        s.getDimensions();
        s.area();
        Square sq = new Square(5);
        sq.area();
        Rectangle r = new Rectangle(2,3);
        r.area();
        Circle c = new Circle(6);
        c.area();
    }
}