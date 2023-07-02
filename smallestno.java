import java.util.Scanner;

class primeno {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int no = sc.nextInt();
        for (int i = 2; i < no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("this is not prime");
        } else {
            System.out.println("this is prime");
        }

    }

}
