public class Stringsum {

        public static void main(String args[]) {
            String si = "meght";
            char[] ch = si.toCharArray();
            int length = ch.length;
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += (int) ch[i];
            }
            System.out.println("Sum of string: " + sum);
        }
    }
    