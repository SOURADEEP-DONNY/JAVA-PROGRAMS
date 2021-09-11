class Static_variable
{
    public static void main(String args[])
    {
        Test.roll=10;
        System.out.println("Roll = "+Test.roll);
        System.out.println("Marks = "+Test.marks);
    }
}

class Test
{
    static int roll;
    static int marks=99;
}