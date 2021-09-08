import java.util.Scanner;
class TwoNumbersAdd
{
    public static void main(String args[])
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        a=obj.nextInt();
        System.out.println("Enter 2nd number:-");
        b=obj.nextInt();
        System.out.print("Sum ="+(a+b));
    }
}