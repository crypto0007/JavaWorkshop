import java.util.*;
abstract class Geometry
{
    public abstract double perimeter();
}
class Square extends Geometry
{
    double length;
    public Square(double l)
    {
        length=l;
    }
    public double perimeter()
    {
        return 4*length;
    }
}
class Circle extends Geometry
{
    double radius;

    final static double PI=3.14d;
    public Circle(double r)
    {
        radius=r;
    }
    public double perimeter()
    {
        return 2*PI*radius;
    }
}
class CalPer
{
    public static void main(String args[])
    {
        int ch;
        double length,radius;
        System.out.println("Menu:\n1. Square\n2. Circle\nEnter your Choice: ");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        switch(ch)
        {
            case 1:
                Scanner s2=new Scanner(System.in);
                System.out.println("Enter length of the Square: ");
                length=s2.nextDouble();
                Square squ=new Square(length);
                System.out.println("Perimeter of Square: "+squ.perimeter());
                break;

            case 2:
                Scanner s3=new Scanner(System.in);
                System.out.println("Enter radius of the Circle: ");
                radius=s3.nextDouble();
                Circle cir=new Circle(radius);
                System.out.println("Perimeter of Circle: "+cir.perimeter());
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}