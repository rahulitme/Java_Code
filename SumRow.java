class SumRow {
    public static void main(String[] args) {

        int a[][] = { { 1, 3, 4, 4 }, { 1, 3, 4, 4 }, { 1, 3, 4, 4 }, { 1, 3, 4, 4 } };

        // Display elements of the 2D array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate and display the sum of each row in the 2D array
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
        }
    }
}
