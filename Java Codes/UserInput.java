import java.util.Scanner;
class UserInput1
{
    public static void main(String args[])
    {
        int a;
        float b;
        String st;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String:-");
        st=obj.nextLine();
        System.out.println("Given String :- "+st);
        System.out.println("Enter an Integer:- ");
        a=obj.nextInt();
        System.out.println("GIVEN INTEGER = "+a);
        System.out.println("Enter a floating point number:- ");
        b=obj.nextFloat();
        System.out.println("GIVEN FLOAT:- "+b);
    }
}