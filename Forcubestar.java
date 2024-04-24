
public class Forcubestar {
    public static void main(String[] args) {
        int size = 4; // Size of the cube
        for (int i = 0; i < size; i++) {
            // Print stars for the top face
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Print stars for the sides
        for (int i = 0; i < size - 2; i++) {
            System.out.print("* "); // Left side
            for (int j = 0; j < size - 2; j++) {
                System.out.print("  "); // Empty spaces for the inner part
            }
            System.out.println("*"); // Right side
        }

        // Print stars for the bottom face
        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
    }
}
