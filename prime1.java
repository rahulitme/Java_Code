package hello;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class prime1{

	public static void main(String[] args) {
		System.out.println(isPrime(9)); // true
		System.out.println(isPrime(9)); // false
	}
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
