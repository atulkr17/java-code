import java.util.Scanner;
class Perfect_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int temp = n;
        int temp1 = n;
        int sum=0;
        for(int i=1; i<=temp1/2; i++)
        {
          if(n%i==0)
          {
            sum = sum + i;
          }
          
        }
        if(temp==sum)
        {
            System.out.println("is perfect number");
        }
        else
        {
            System.out.println("is not perfect number");
        }
        


    }
}