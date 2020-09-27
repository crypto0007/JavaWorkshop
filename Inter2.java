interface I1
{
    public void show();
}
class A implements I1
{
    public void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
    public void show()
    {
        super.show();
        System.out.println("B");
    }
}
class C extends B
{
    public void show()
    {
        super.show();
        System.out.println("C");
    }
}
class Inter2
{
    public static void main(String args[])

    {
        C c1=new C();
        c1.show();
    }
}
