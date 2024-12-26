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


import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String s1 = "junar";
        char[] ch = s1.toCharArray();
        
        
        Arrays.sort(ch);
        
        for(char c:ch)
        {
            System.out.println(c);
        }
    }
}
