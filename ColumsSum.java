public class ColumsSum {

    public static void main(String[] args) {

        int a[][] = { { 1, 3, 4, 4 }, { 1, 3, 4, 4 }, { 1, 3, 4, 4 }, { 1, 3, 4, 4 } };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum of column");

        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += a[j][i];
            }
            System.out.println("Sum of colum " + (i + i) + ": " + rowSum);
        }
    }
}
