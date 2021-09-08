import java.util.Scanner;
class SwitchCase
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("ENTER 1ST NUMBER:-");
        a=obj.nextInt();
        System.out.print("ENTER 2ND NUMBER:-");
        b=obj.nextInt();
        System.out.println("MENU");
        System.out.println("-----------------------------------");
        System.out.println("1. SUM");
        System.out.println("2. SUBSTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVISION");
        System.out.print("ENTER YOUR CASE:-");
        c=obj.nextInt();
        switch(c)
        {
            case 1: {
                int r;
                r=a+b;
                System.out.print("SUM="+r);
                break;
            }
            case 2: {
                int r;
                r=a-b;
                System.out.print("DIFFERENCE = "+r);
                break;
            }
            case 3: {
                int r;
                r=a*b;
                System.out.print("MULTIPLY = "+r);
                break;
            }
            case 4: {
                int r;
                r=a/b;
                System.out.print("DIVISION = "+r);
                break;
            }
            default:    {
                System.out.print("SORRY CASE NOT FOUND!!!");
            }
        }
    }
}