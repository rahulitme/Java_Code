
class Logical {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 20, d = 0;
        System.out.println("var" + a);
        System.out.println("var" + b);
        System.out.print("var" + c);
        if ((a < b) || (b == c)) {
            d = a + b + c;
            System.out.println("this sum is" + d);

        } else {
            System.out.println("this is thi wrong logica");
        }
    }
}
