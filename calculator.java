
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        System.out.println("enter the first number");
        num1 = sc.nextDouble();
        System.out.println("enter the operato like(+,-,*,/)5");
        operator = sc.next().charAt(0);
        System.out.println("second the second");
        num2 = sc.nextDouble();
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("add is " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("sub is" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("mul is" + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("div is" + result);
                    break;
                } else {
                    System.out.println("this is invalid");

                }
                break;
            default: {
                System.out.println("this is not invalid operator");

            }

        }
    }
}
