import java.util.Scanner;
class WhileLoop
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.print("ENTER A NUMBER UPTO WHICH YOU WANT TO PRINT FROM ZERO:-");
        n=obj.nextInt();
        int i=0;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}