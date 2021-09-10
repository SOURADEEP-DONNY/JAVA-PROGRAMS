import java.util.Scanner;
class WhileExample
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i;
        System.out.print("Enter 0 to Exit");
        while(true)
        {
            System.out.println("Enter any Integer values");
            i=obj.nextInt();
            if(i==0)
            {
                System.out.println("Program Exit");
                break;
            }
            System.out.println("You Entered: "+i);
        }
    }
}