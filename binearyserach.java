public class binearyserach {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 6, 7, 8, 8, 3, 4, 5 };
        int li = 0;
        int srch = 6;
        int hi = a.length - 1;
        int mi = (li + hi) / 2;

        while (li <= hi) {
            mi = (li + hi) / 2;

            if (a[mi] == srch) {
                System.out.println("Element found at index position: " + mi);
                break;

            } else if (a[mi] < srch) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
        }

        if (li > hi) {
            System.out.println("Element not found");
        }
    }
}
