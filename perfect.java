import java.util.Scanner;
class perfect{
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0); //
            
            sum=sum+1;//
        }
    if(n==sum)
    System.out.print("this is perfect no");
    else
    System.out.print("this is no perfect no");
    }
}
//run