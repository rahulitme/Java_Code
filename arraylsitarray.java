
import java.util.*;

public class arraylsitarray {
    public static void main(String[] args) {

        // ArrayList object creation .
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        // Printing the list
        System.out.println("ArrayList : " + list);

        // converting ArrayList to Array
        String[] array = list.toArray(new String[0]);

        // Printing the Array
        System.out.println("Element of Arraylist as Array :" + Arrays.toString(array));
    }
}
