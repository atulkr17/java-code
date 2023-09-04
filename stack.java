import java.util.Scanner;
class Mystack{
    Scanner sc= new Scanner(System.in);
    int n;
    int stack[];
    int top=-1;
    Mystack(int n, int stack[])
    {
       this.n=n;
       this.stack=stack;
    }
    void push()
    {
      int data;
      System.out.println("enter data");
      data=sc.nextInt();
      if(top==n-1)
      {
        System.out.println("stack is overflow");
      }
      else
      {
        top++;
        stack[top]=data;
      }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow");
        }
        else
        {
            int item=stack[top];
            top--;
            System.out.println("delete value" + item);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow");
        }
        else
        {
            System.out.println("present in stack");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }
    }
}
class Stack
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number stack size");
        n=sc.nextInt();
        int stack[] = new int[n];
        Mystack ob = new Mystack(n,stack);
        int ch=1;
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enetr a choice number \n press 1: push \n press 2: pop \n press 3: display \n press 4 exit  ");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    ob.push();
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.display();
                    break; 
                case 4:
                   System.exit(0);       
            }
        }while(ch!=0);
    }
}
