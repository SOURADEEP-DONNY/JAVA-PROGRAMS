import java.util.Scanner;
class Instance_Method4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("ENTER TWO NUMBERS FOR MULTIPLICATION: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        Class2 o=new Class2();
        int mul=o.multiply(num1,num2);
        System.out.println("MULTIPLICATION RESULT ="+mul);
        System.out.println("ADDITION RESULT ="+o.add());
        System.out.println("EXECUTION COMPLETED");
    }
}

class Class2
{
    int add()
    {
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.println("ENTER TWO NUMBERS FOR ADDITION :-");
        a=obj.nextInt();
        b=obj.nextInt();
        return a+b;
    }
    int multiply(int a,int b)
    {
        int x=a;
        int y=b;
        int z=x*y;
        return z;
    }
}