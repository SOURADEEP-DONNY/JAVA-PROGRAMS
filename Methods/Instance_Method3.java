import java.util.Scanner;
class Instance_Method3
{
    public static void main(String args[])
    {
        int c;
        AnotherClass obj = new AnotherClass();
        c=obj.sum();
        System.out.println("Sum = "+c);
        System.out.println("PRINTING FROM MAIN \nPROGRAM EXECUTED SUCCESSFULLY.");
    }
}

class AnotherClass
{
    int sum()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS FOR ADDITION: ");
        a=sc.nextInt();
        b=sc.nextInt();
        return a+b;
    }
}