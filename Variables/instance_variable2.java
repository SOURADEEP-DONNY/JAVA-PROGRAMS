class instance_variable2
{
    public static void main(String args[])
    {
        Class2 obj=new Class2();
        Class2 obj1=new Class2();
        obj.roll=03;
        obj1.roll=41;
        obj1.marks=88;
        System.out.println("ROLL OF obj = " +obj.roll);
        System.out.println("ROLL OF obj1 = " +obj1.roll);
        System.out.println("MARKS OF obj = " +obj.marks);
        System.out.println("MARKS OF obj1 = " +obj1.marks);
    }
}

class Class2
{
    int roll;
    int marks=100;
}
//HERE CONSIDERING MORE THAN ONE OBJECT OF A PARTICULAR CLASS WHICH ULTIMATELY CREATES COPY OF THAT INSTANCE VARIABLE OF THE CLASS.