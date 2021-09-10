//PRINTING OF WHOLE NUMBERS UPTO A PARTICULAR USER INPUT NUMBER (SIDE BY SIDE)
import java.util.Scanner;
class ForLoop1
{
    public static void main(String args[])
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number:- ");
        n=obj.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print("\t"+i);
        }
    }
}