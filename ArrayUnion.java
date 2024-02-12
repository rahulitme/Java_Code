package hello;

import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> union = new HashSet<>();

        for (int num : array1) {
            union.add(num);
        }

        for (int num : array2) {
            union.add(num);
        }

        System.out.println("Union of array1 and array2: " + union);
    }
}

