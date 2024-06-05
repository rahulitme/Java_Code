
class AnotherClass {
    AnotherClass(int b) {
        System.out.println("Value of b: " + b);
    }
}

class HelloWorld {
    HelloWorld(int a) {
        System.out.println("Value of a: " + a);
    }

    public static void main(String[] args) {
        // Creating an instance of HelloWorld with an integer argument
        HelloWorld h1 = new HelloWorld(87);

        // Creating an instance of AnotherClass with an integer argument
        AnotherClass anotherObj = new AnotherClass(42);
    }
}
