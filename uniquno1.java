public class UniqUno1 {
    public static void main(String args[]) {
        int[] a = { 12, 4, 5, 6, 7 };

        System.out.print(a[0] + " ");

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println();
    }
}
