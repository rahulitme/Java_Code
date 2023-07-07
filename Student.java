class Student {
    int roll;
    String name;

    // Parameterized constructor
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        Student S1 = new Student(99, "dog");
        Student S2 = new Student(99, "cat");

        System.out.println("Student S1: " + S1.name + " " + S1.roll);
        System.out.println("Student S2: " + S2.name + " " + S2.roll);
    }

}
