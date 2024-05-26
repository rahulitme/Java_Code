import java.io.*;
import java.util.*;

public class collectioncompare {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(32);
        list.add(45);
        list.add(33);

        int minimum = Collections.min(list);
        int maximum = Collections.max(list);

        if (minimum == maximum) {
            System.out.println("this is aare unique value ");
        } else {
            System.out.println(minimum);

        }
        System.out.println(maximum);
    }
}
