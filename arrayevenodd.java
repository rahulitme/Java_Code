import java.util.Scanner;

class arrayevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
