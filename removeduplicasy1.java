public class removeduplicasy1 {
    public static void main(String[] args) {
        int[] a = { 4, 5, 3, 5, 4, 4, 2, 8, 8, 9 };

        int[] temp = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length - 1];

        for (int i = 0; i <= j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}