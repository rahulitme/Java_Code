public class CheckStrValue {

    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println(containsCharacter(myStr, 'H'));
        System.out.println(containsCharacter(myStr, 'e'));
        System.out.println(containsCharacter(myStr, 'i'));
    }

    public static boolean containsCharacter(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
