class Factorial
{
    public static void main(String args[])
    {
        int i=1,j,p=1,pr=1;
        while(i<=5)
        {
                pr=pr*i;
                i++;
        }
        System.out.println("Factorial of 5 from WHILE LOOP ="+pr);
        for(j=1;j<=5;j++)
        {
            p=p*j;
        }
        System.out.println("Factorial of 5 from FOR LOOP = "+p);
    }
}