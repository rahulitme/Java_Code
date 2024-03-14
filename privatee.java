package firstprgm;

public class privatee {
    public int a = 10;
    protected String b = "sunny";
    private int c = 10;

    public static void main(String[] args) {
        privatee p1 = new privatee();
        System.out.println("interger value" + p1.a + " " + p1.b);
        System.out.println("string value" + p1.b);
        System.out.println("interger value" + p1.c);
    }
}
