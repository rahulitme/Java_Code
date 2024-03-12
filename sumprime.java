
import java.util.Scanner;

public class sumprime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = s.nextInt();
        System.out.print("Enter the second number: ");
        int p = s.nextInt();
        int sum = n + p;
        boolean isPrime = true;

        for (int i = 2; i <= sum / 2; i++) {
            if (sum % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && sum > 1) {
            System.out.println("The sum of the two numbers is prime.");
        } else {
            System.out.println("The sum of the two numbers is not prime.");
        }
    }
}
