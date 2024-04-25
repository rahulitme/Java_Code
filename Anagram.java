public

import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "baa";

        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings to char arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort the char arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // If sorted char arrays are the same, then the strings are anagrams
            boolean result = Arrays.equals(charArray1, charArray2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
