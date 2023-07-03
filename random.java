
import java.util.Random;

class random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("the random numcer is generate is" + num);
    }
}
