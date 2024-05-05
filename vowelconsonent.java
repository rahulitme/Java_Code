public class vowelconsonent {

    public static void main(String[] args) {
        String s1 = "mohan";
        int vowelCount = 0;
        int consonantCount = 0;
        char ch[] = s1.toCharArray();
        System.out.println("Vowels:");
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                vowelCount++;
                System.out.println(ch[i]);
            } else {
                consonantCount++;
            }
        }
        System.out.println("\nConsonants:");
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
                System.out.println(ch[i]);
            }
        }
        System.out.println("\nNumber of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
