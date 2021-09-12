class Instance_Method2
{
    public static void main(String args[])
    {
        Instance_Method2 obj=new Instance_Method2();
        String st=obj.another_one();
        System.out.println("First name = "+st);
        System.out.println("Last name = Das");
        obj.new_method();
    }
    void new_method()
    {
        int a=100;
        System.out.println("From new_method "+a);
    }
    String another_one()
    {
        String s="Souradeep";
        return s;
    }
}