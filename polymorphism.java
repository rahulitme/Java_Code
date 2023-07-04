class Polymorphism {

    void add(int a) {
        System.out.println("Welcome India");
    }

    void add() {
        System.out.println("India");
    }

    public static void main(String args[]) {
        Polymorphism t = new Polymorphism();
        t.add(10);
    }
}
