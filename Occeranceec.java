
import java.util.HashMap;
import java.util.Map;

public class Occeranceec {
    public static void main(String[] args) {
        String input = "YourInputStringHere"; // Replace this with your input string
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray(); // Fixed typo in toCharArray()

        for (char ch : chars) {
            if (!map.containsKey(ch)) { // Fixed typo in containsKey()
                map.put(ch, 1);
            } else {
                int cnt = map.get(ch);
                map.put(ch, cnt + 1); // Fixed typo in incrementing count
            }
        }

        System.out.println(map);
    }
}
