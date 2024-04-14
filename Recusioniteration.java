package hello;

public class Recusioniteration {
    public static void main(String args[]) {
        print(1);
    }

    static void print(int n) {
    	if(n>5)
    	{
    		return;
    	}
        System.out.println(n);
        print1(n + 1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(n + 1);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(n + 1);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(n + 1);
    }

    static void print4(int n) {
        System.out.println(n);
        if (n <= 4) {
            print(n + 1);
        }
    }
}
