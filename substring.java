
public class substring {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String substringToReplace = "World";
        String replacement = "Java";

        // Replace the substring
        String modifiedString = replaceSubstring(originalString, substringToReplace, replacement);

        // Print the modified string
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceSubstring(String original, String toReplace, String replacement) {
        // Check if the original string contains the substring to replace
        if (!original.contains(toReplace)) {
            return original; // If not, return the original string as it is
        }

        // Use the replaceAll method to replace all occurrences of the substring
        String modified = original.replaceAll(toReplace, replacement);
        return modified;
    }
}