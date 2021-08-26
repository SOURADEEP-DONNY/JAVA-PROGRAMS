/* MULTIPLE CLASS CODE */

class Example
{
    int a,b,total=0;
    void add()
    {
        total=a+b;
    }
}
class MultipleClass
{
    public static void main(String args[])
    {
        Example obj=new Example();
        obj.a=10;
        obj.b=20;
        obj.add();
        System.out.println("TOTAL ="+obj.total);
    }
}