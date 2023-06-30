
import java.util.Scanner;

public class largest_value {

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("The maximum element is: " + max);
    }
}
