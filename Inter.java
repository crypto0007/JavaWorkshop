import java.io.*;
import java.util.*;
interface Arithmetic
{
    public float add();
    public float mul();
    public float div();
    public float sub();
    public default void displayAns(String s1,float ans)
    {
        System.out.println(s1+ans);
    }
}
class Calculator implements Arithmetic

        {
public float num1,num2;
public Calculator(float n1,float n2)
        {
        num1=n1;
        num2=n2;
        }
public float add()
        {
        return num1+num2;
        }
public float mul()
        {
        return num1*num2;
        }
public float div()
        {
        return num1/num2;
        }
public float sub()
        {
        return num1-num2;
        }
        }
class Inter
{
    public static void main(String args[])
    {
        float num1,num2,ans=0.0f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Numeber: ");
        num1=sc.nextFloat();
        System.out.println("Enter Second Number: ");
        num2=sc.nextFloat();
        Calculator cal=new Calculator(num1,num2);
        ans=cal.add();
        cal.displayAns("addition: ",ans);
        ans=cal.mul();
        cal.displayAns("Multiplication: ",ans);
        ans=cal.div();
        cal.displayAns("Division: ",ans);
        ans=cal.sub();
        cal.displayAns("Subtraction: ",ans);
    }
}