public class Coprime {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 25;

        // Calculate GCD using a while loop
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Check if GCD is 1
        if (a == 1) {
            System.out.println(num1 + " and " + num2 + " are co-prime.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not co-prime.");
        }
    }
}
