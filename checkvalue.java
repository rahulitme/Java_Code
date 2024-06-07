class Chaeckvalue {
    public static void main(String[] args) {
        int a[] = { 3, 4, 0, 3, 5, }; // Initialize the
        boolean x = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 2) {
                x = true;
                break;
            }
        }
        if (x) {
            System.out.println("yes 2 is there");
        } else {
            System.out.println("noo it no ");
        }
    }
}
