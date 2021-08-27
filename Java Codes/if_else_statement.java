import java.util.Scanner;
class If_else_statement
{
    public static void main(String args[])
    {
        int age;
        Scanner ob = new Scanner(System.in);
        System.out.print("\nENTER AGE:-");
        age=ob.nextInt();
        if(age>=60)
        {
            System.out.println("\nSENIOR CITIZEN");
        }
        else
        {
            System.out.println("NON SENIOR CITIZEN");
        }
    }
}