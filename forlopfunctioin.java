class ForLoopFunction {
    public static void hand(int s, int m, int e) {
        for (int i = s; i < m; i += e) {
            System.out.println("this is the i value " + i);
        }
    }

    public static void main(String args[]) {
        hand(3, 10, 2);
    }
}
