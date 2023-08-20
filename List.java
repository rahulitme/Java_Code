package firstprgm;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        // Create an ArrayList to store strings
        ArrayList<String> l1 = new ArrayList<>();

        // Add elements to the ArrayList
        l1.add("deepak");
        l1.add("sunny");
      

        // Print the elements of the ArrayList
        for (String element : l1) {
            System.out.println(element);
        }
    }
}
