import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String s1 = "mahegr";
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        // String sortedString = new String(charArray);

        System.out.println(charArray);
    }
}
