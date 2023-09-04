public class fibonacci
{
    public static void main(String[] ar)
    {
        int n=9;
        int a=0;
        int b=1;
        int i,h;
        System.out.println(a);
        System.out.println(b);
        for(i=2;i<n;i++)
        {
           h=a+b;
           a=b;
           b=h;
           System.out.println(h);
        }
    }
}