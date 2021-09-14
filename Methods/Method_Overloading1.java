//Type-1 In terms of type of parameters.
import java.util.Scanner;
class Method_Overloading1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        float c,d;
        System.out.println("Enter two integer values:-");
        a=sc.nextInt();
        b=sc.nextInt();
        Class2 obj=new Class2();
        int res1=obj.add(a,b);
        System.out.println("Integer addition:-"+res1);
        System.out.println("Enter two float values for addition:-");
        c=sc.nextFloat();
        d=sc.nextFloat();
        float res2=obj.add(c,d);
        System.out.println("Float addition:-"+res2);
    }
}

class Class2
{
    int add(int a,int b)
    {
        int x=a;
        int y=b;
        int c=x+y;
        return c;
    }
    
    float add(float a,float b)
    {
        float p=a;
        float q=b;
        float z=p+q;
        return z;
    }
}