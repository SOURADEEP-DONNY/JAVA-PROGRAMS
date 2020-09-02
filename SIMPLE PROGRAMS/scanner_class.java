import java.util.Scanner;
class scanner_class
{
    public static void main(String args[])
    {
        int a;
        float b;
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.print("\nEnter String:-");
        str=obj.nextLine();
        System.out.print("\nYour Entered String is :- "+str);
        System.out.print("\nEnter an integer:-");
        a=obj.nextInt();
        System.out.print("\nInteger = "+a);
        
        System.out.print("\nEnter a floating point number:-");
        b=obj.nextFloat();
        System.out.print("\nFloating Point Number:-"+b);
        
    }
}