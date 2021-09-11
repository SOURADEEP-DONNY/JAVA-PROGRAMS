import java.util.Scanner;
class Local_variable
{
    public static void main(String args[])
    {
        Class2 o=new Class2();
        o.display();
        System.out.print("Printing from main method.");
    }
}

class Class2
{
    void display()
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:-");
        a=sc.nextInt();
        System.out.println(a);
    }
}