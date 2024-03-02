class String {
    public static void main(String[] args) {
        String s1 = "onish";
        char[] ch = s1.toCharArray(); // Convert string to character array

        ch[3] = 'r';
        System.out.println(ch);
    }
}