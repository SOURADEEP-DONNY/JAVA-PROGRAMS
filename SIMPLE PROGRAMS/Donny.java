class Donny
{
    public static void main(String args[])
    {
        add_ex ref_var = new add_ex();
        ref_var.a=10;
        ref_var.b=20;
        ref_var.add();
        System.out.print("Addition="+ref_var.total);
    }
}