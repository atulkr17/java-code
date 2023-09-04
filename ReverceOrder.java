public class ReverceOrder
{
    public static void main(String[] agrs)
    {
      int arr[]={4,3,2,6,5};
      int n=arr.length;
      System.out.println("origenal array");
      for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }
      System.out.println("reverce order");
      for(int i=n-1;i>=0;i--)
      {
        System.out.println(arr[i]);
      }

    }
}