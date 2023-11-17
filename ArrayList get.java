
import java.util.ArrayList;

class ArrayListget {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        // access element at index 1
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);
    }
}
