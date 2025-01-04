class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 46, 8, 8};

        // Print elements from index 3 onwards
        for (int i = 3; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print elements from index 0 to index 2
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}  46, 8, 8 1, 2, 3,//output
