
import java.util.Scanner;

public class twodmatrix {
    public static void main(String[] args) {
        int[][] a = new int[4][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
