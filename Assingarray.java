public class Assingarray {

    public static void main(String args[]) {
        int a[] = new int[5];
        int b[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[3] = 90;
        a[4] = 34;

        // Print elements of array 'a'
        System.out.println("Array 'a':");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Copy elements of array 'a' to array 'b'
        System.out.println("Array 'b':");
        for (int j = 0; j < b.length; j++) {
            b[j] = a[j];
            System.out.println(b[j]);
        }
    }
}
