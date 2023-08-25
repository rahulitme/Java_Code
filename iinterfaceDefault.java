interface Mobile {
    default void neha() {
        System.out.println("This user is not having a phone");
    }

    void user();
}

class Ansu implements Mobile {
    @Override
    public void user() {
        System.out.println("This user is not having money");
    }
}

class iinterfaceDefault {
    public static void main(String args[]) {
        Ansu a = new Ansu();
        a.neha(); // Calling default method from the interface
        a.user();
    }
}
