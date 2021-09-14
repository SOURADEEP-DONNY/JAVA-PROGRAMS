//Type-1 In terms of type of parameters.
import java.util.Scanner;
class Method_Overloading2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        String ss;
        ss="";
        System.out.println("Enter two integer numbers:-");
        a=sc.nextInt();
        b=sc.nextInt();
        Class2 obj=new Class2();
        obj.add(a,b);
        obj.add(a,ss);
    }
}

class Class2
{
    void add(int a,int b)
    {
        int x=a; 
        int y=b;
        int z=x+y;
        System.out.println("Addition ="+z);
    }
    void add(int a, String s)
    {
        int x=a;
        String st=s;
        st="Souradeep";
        System.out.println("Value of x = "+x);
        System.out.print(st);
    }
}