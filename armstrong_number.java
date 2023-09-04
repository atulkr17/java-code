import java.util.Scanner; 
public class armstrong_number
{
    public static void main(String[] args)
    {
        int a,temp,temp1,sum=0;
        
        System.out.println("Taking input from user");

       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
        temp=n;
        temp1=n;
        int count=0;
        while(temp1!=0)
        {
            temp1=temp1/10;
            count++;
        }
        while(n!=0)
        {
            a=n%10;
            sum=sum+((int)Math.pow(a,count));
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("this is not armstrong number");
        }
    }
  
}