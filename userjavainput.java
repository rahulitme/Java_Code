import java.util.Scanner;

class userjavainput {

    public static void main(String args[]) {
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int c = sc.nextInt();

        while (i <= c) {
            System.out.println("annada college" + i);
            i++;
        }
    }

}
