package hello;


	import java.util.Scanner;
	public class MissingNumber {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the n value: ");
	      int n = sc.nextInt();
	      int inpuArray[] = new int[n];
	      System.out.println("Enter (n-1) numbers: ");
	      for(int i=0; i<=n-2; i++) {
	         inpuArray[i] = sc.nextInt();
	      }
	      //Finding the missing number
	      int sumOfAll = (n*(n+1))/2;
	      int sumOfArray = 0;
	      for(int i=0; i<=n-2; i++) {
	         sumOfArray = sumOfArray+inpuArray[i];
	      }
	      int missingNumber = sumOfAll-sumOfArray;
	      System.out.println("Missing number is: "+missingNumber);
	   }
	}


class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6};//number should be unique not duplicate
        int sum = 0;
        for( int i=0;i<a.length;i++)
        {
          sum = sum + a[i];
        }
        System.out.println(sum);
    
    int sum1 = 0;
        for(int i=0;i<=6;i++)
        {
            sum1 = sum1+i;
        }
         System.out.println("the mussing number  value "+(sum1-sum));
    }
    }


