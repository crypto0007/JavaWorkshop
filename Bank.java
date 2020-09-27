import java.util.*;
class Account
{
    String name,branch;
    long acno;
    float amount,rate;
    int year;
    Scanner s;
    public void getCustInfo()
    {
        s=new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        name=s.nextLine();
        System.out.println("Enter Account Number: ");
        acno=s.nextLong();
        System.out.println("Enter Branch Name: ");
        branch=s.next();
    }
    public void displayInfo()
    {
        System.out.println("\nCustomer Account Information: ");
        System.out.println("Customer Name: "+name);
        System.out.println("Account No: "+acno);
        System.out.println("Branch Name: "+branch);
    }
}
class Savings extends Account
{
    Scanner s2;
    public void getSavingInfo()
    {
        s2=new Scanner(System.in);
        super.getCustInfo();
        System.out.println("Enter Amount: ");
        amount=s2.nextFloat();
        System.out.println("Enter Rate: ");
        rate=s2.nextFloat();
        System.out.println("Enter Year: ");
        year=s2.nextInt();
    }
    public float calIntAmt()
    {
        return (amount*rate*year)/100;

    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Amount: "+amount);
        System.out.println("Rate: "+rate);
        System.out.println("Year: "+year);
        System.out.println("Interest Amount: "+calIntAmt());
        System.out.println("Total: "+(calIntAmt()+amount));
    }
}
class FixedDeposit extends Account
{
    Scanner s2;
    public void getFDInfo()
    {
        super.getCustInfo();
        s2=new Scanner(System.in);
        System.out.println("Enter Amount: ");
        amount=s2.nextFloat();
        System.out.println("Enter Year: ");
        year=s2.nextInt();
        if(year>0 && year<=2)
        {
            rate=6.5f;
        }
        else if(year>2 && year<=5)
        {
            rate=7.5f;
        }
        else if(year>5 && year<=10)
        {
            rate=8.5f;
        }
        else if(year>10)
        {
            rate=9.0f;
        }
        else
        {
            System.out.println("You Will Inputed Invalid Year...");
            System.exit(0);
        }
    }
    public float calIntAmt()
    {
        return (amount*rate*year)/100;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Amount: "+amount);
        System.out.println("Rate: "+rate);
        System.out.println("Year: "+year);
        System.out.println("Interest Amount: "+calIntAmt());
        System.out.println("Total: "+(calIntAmt()+amount));
    }
}
class Bank
{
    public static void main(String args[])
    {
        byte ch;
        Scanner sca=new Scanner(System.in);
        System.out.println("Menu:\n1. Saving Account\n2. FixedDeposit\nEnter yourChoice: ");
        ch=sca.nextByte();
        switch(ch)
        {
            case 1:
                Savings sd=new Savings();
                sd.getSavingInfo();
                sd.displayInfo();
                break;
            case 2:
                FixedDeposit fd=new FixedDeposit();
                fd.getFDInfo();
                fd.displayInfo();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}