import java.util.Scanner;
class instance_method
{
    public static void main(String args[])
    {
        instance_method o=new instance_method();
        o.disp();
        System.out.print("PROGRAM ENDED");
    }
    void disp()
    {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.print("\nENTER A NUMBER:-");
        a=obj.nextInt();
        System.out.println("YOUR INPUT NUMBER = "+a);
    }
}