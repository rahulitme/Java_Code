class zeroend {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 0, 505 };
        int len = arr.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < len) {
            arr[count++] = 0;
        }

        for (int j = 0; j < len; j++) {
            System.out.println(arr[j]);
        }
    }
}
