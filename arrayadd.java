import java.util.Scanner;

public class arrayadd {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum = arr[i] + sum;
        }

        System.out.println("\nResult: " + sum);
    }
}
