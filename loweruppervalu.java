
import java.util.Scanner;

class loweruppervalue {
    public static void main(String[] args) {
        char ch, ch2;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("lowerc case  " + ch2);
        }

        else {

            ch2 = Character.toUpperCase(ch);
            System.out.println("uppercase case" + ch2);

        }
    }
}
