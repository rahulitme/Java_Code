public class Function1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        SquareMaker squareMaker = item -> item * item;
        for (int i = 0; i < array.length; i++) {
            System.out.println(squareMaker.square(array[i]));
        }
    }
}