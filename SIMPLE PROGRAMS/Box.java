class Box
{
    private int length,breadth,height;
    public void SetDimension(int l, int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void ShowDimension()
    {
        System.out.print("\nL="+length);
        System.out.print("\nB="+breadth);
        System.out.print("\nH="+height);
    }
}