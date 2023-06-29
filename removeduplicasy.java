import java.util.Scanner;

public class removeduplicasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  sizes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length - 1];

        System.out.println("Array with duplicates removed: ");
        for (int i = 0; i <= j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}