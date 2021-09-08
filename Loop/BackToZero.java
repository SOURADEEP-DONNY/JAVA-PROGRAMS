import java.util.Scanner;
class BackToZero
{
    public static void main(String args[])
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER FROM WHICH WE START BACK CALCULATING:-");
        n=obj.nextInt();
        int i=n;
        while(i>=0)
        {
            System.out.println(i);
            i=i-1;
        }
    }
}