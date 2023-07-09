public class merjarrays {

    public static void main(String[] args) {
        int a[] = { 11, 33 };
        int b[] = { 11, 33, 23, 34 };

        int a_leng = a.length;
        int b_leng = b.length;
        int c_leng = a_leng + b_leng;

        int[] c = new int[c_leng];

        for (int i = 0; i < a_leng; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b_leng; i++) {
            c[a_leng + i] = a[i];
        }
        for (int i = 0; i < c_leng; i++) {

            System.out.println("this combination value is" + c[i]);
        }
    }
}
