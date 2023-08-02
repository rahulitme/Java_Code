import java.util.Scanner;

class gcdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = 0;

        for (int i = 1; i <= a; i++)
            if (a % i == 0 && b % i == 0) {
                g = i;
            }

        System.out.println("gcd value is " + g);
    }
}
