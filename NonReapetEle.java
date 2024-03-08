class NonReapeatEle {

    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 3 };
        boolean isUnique;

        for (int i = 0; i < a.length; i++) {
            isUnique = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(a[i]);
            }
        }
    }
}
