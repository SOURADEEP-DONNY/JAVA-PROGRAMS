//Type-2 In terms of number of parameters.
//-----------------------------------------------------------------------------
import java.util.Scanner;
class Method_Overloading3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,d,e;
        int o;
        Class2 obj=new Class2();
        System.out.println("ENTER TWO FLOATING NUMBERS FOR ADDITION: ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.println("Result 1 ="+obj.add(a,b));
        System.out.println("ENTER THREE FLOATING NUMBERS FOR ADDITION: ");
        c=sc.nextFloat();
        d=sc.nextFloat();
        e=sc.nextFloat();
        System.out.println("Result 2 ="+obj.add(c,d,e));
        System.out.println("ENTER AN INTEGER NUMBERS FOR ADDITION: ");
        o=sc.nextInt();
        System.out.println("Result 3 ="+obj.add(a,o));
    }
}
class Class2
{
    float add(float a,float b)
    {
        float x=a;
        float y=b;
        float res1=x+y;
        return res1;
    }
    float add(float a,float b,float c)
    {
        float p=a;
        float q=b;
        float r=c;
        return p+q+r;
    }
    float add(float a, int b)
    {
        float i=a;
        int j=b;
        return i+j;
    }
}