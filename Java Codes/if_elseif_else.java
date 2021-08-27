import java.util.Scanner;
class if_elseif_else
{
    public static void main(String args[])
    {
        Scanner abc = new Scanner(System.in);
        int age;
        System.out.print("ENTER AGE:-");
        age=abc.nextInt();
        if(age>0)
        {
            if(age<18)
            {
                System.out.println("NON-VOTER MINOR");
            }
            else if(age>=18 && age<60)
            {
                System.out.print("VOTER BUT NOT SENIOR CITIZEN");
            }
            else
            {
                System.out.println("VOTER AND SENIOR CITIZEN");
            }
        }
        else
        {
            System.out.println("SORRY AGE CANNOT BE NEGATIVE!!!");
        }
    }
}