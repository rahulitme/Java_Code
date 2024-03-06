public class removespacechar {
  
        public static void main(String[] args) {
            String s1 = "meaghe@%";
            char[] ch = s1.toCharArray(); // Correcting the method name toCharArray() and storing it in a char array
            for (int i = 0; i < ch.length; i++) {
                char p = ch[i];
                if ((p >= 'a' && p <= 'z') || (p >= 'A' && p <= 'Z')) { // Checking if character is an alphabet character
                    System.out.print(p); // Printing the character p instead of the whole array ch
                }
            }
        }
    }
    
}
