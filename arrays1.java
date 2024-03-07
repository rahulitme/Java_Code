public class arrays1 {
    public static void main(String args[]) {

        int a[] = { 2, 3, 4, 5, 3 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }

    }
}
