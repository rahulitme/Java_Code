import java.util.Arrays;

public class changevalue {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 2, 3, 2 };
        num(a);
        System.out.println(Arrays.toString(a));

    }

    static void num(int a[]) {
        a[0] = 99;
    }
}
