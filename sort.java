import java.util.Arrays;

public class sort {
    public static void main(String args[]) {
        int a[] = { 3, 53, 4, 2, 4 }; // Added missing semicolon here
        System.out.println("Before sorting the array: " + Arrays.toString(a));
        Arrays.sort(a); // Corrected method name
        System.out.println("After sorting the array: " + Arrays.toString(a)); // Changed "Before" to "After"
    }
}