public class overiding {
    void hello() {
        System.out.println("india");
    }

}

class Test extends overiding {

    void hello() {
        System.out.println("welcom");
    }

    public static void main(String args[]) {
        Test t = new Test();
        t.hello();

    }
}