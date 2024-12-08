import java.util.Scanner;

class primeno {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int no = sc.nextInt();
        for (int i = 2; i < no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("this is not prime");
        } else {
            System.out.println("this is prime");
        }

    }

}
public class Main {
  public static void main(String[] args) {
  int a[] = {5,3,4,5}
  int lower = a[0]
  {
  for(int i=0;i<a.length;i++)
  {
  if(lower>a[i])
  {
  lower = a[i];
  }
    System.out.println(lower);
   
  }
}
