class instance_variable
{
    public static void main(String args[])
    {
        Test obj=new Test();
        obj.mark=99;
        System.out.println("Roll = "+obj.roll);
        System.out.println("Marks = "+obj.mark);
    }
}

class Test
{
    int roll=10;
    int mark;
}

//CONSIDERING SINGLE OBJECT.