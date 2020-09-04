import java.util.Scanner;
class nextLine_code
{
    public static void main(String args[])
    {
        String city;
        Scanner obj=new Scanner(System.in);
        System.out.print("\nEnter a String:-");
        city=obj.nextLine();
        System.out.print("\n"+city);
    }
}