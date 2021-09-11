class Static_variable2
{
    public static void main(String args[])
    {
        Class2 obj=new Class2();
        Class2 obj1=new Class2();
        Class2 obj2=new Class2();
        Class2 obj3=new Class2();
        obj.marks=77;
        obj1.marks=88;
        obj2.marks=23;
        System.out.println("Marks obj = "+obj.marks);
        System.out.println("Marks obj1 = "+obj1.marks);
        System.out.println("Marks obj2 = "+obj2.marks);
        System.out.println("Marks obj3 = "+obj3.marks);
    }
}

class Class2
{
    static int marks=55;
}

//CLEARLY NO COPIES OF THE STATIC VARABLE ARE MADE EVERYTIME A NEW OBJECT IS CREATED THE SAME "static" VARIABLE GETS UPDATED FRO EVERY OBJECT.