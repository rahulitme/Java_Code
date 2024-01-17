package hello;

public class InttoString {

    public static void main(String[] args) {
        int num = 100;
        // Use Integer.toString() method to convert integer to string
        String convertedStr = Integer.toString(num);
        
        if (convertedStr.equals("100")) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
