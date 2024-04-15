class removeElement {
    public static void main(String[] args) {
        int a[] = { 12, 3, 4, 2, 4 };
        int p = 3;

        // Printing the original array
        System.out.println("Original Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Removing the number 'p' from the array
        int[] newArray = removeElement(a, p);

        // Printing the new array after removing 'p'
        System.out.println("New Array after removing " + p + ":");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    // Method to remove an element 'element' from an array 'array'
    public static int[] removeElement(int[] array, int element) {
        int count = 0;
        // Counting the occurrences of 'element' in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }

        // Creating a new array with size 'array.length - count'
        int[] newArray = new int[array.length - count];
        int index = 0;

        // Copying elements from 'array' to 'newArray', excluding 'element'
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                newArray[index++] = array[i];
            }
        }

        return newArray;
    }
}
