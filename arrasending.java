import java.util.Scanner;

public class arrasending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}
