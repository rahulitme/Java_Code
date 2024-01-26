package hello;


public class StringPallindrome {
    public static void main(String[] args) {
        String s = "mama";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
