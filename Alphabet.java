
public class Alphabet {

    public static void main(String[] args) {

        char c = '0';

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}