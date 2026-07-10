public abstract class Student extends Person{

    private static final int id = 0;

    public Student(String name, String userName) {
        super(name, userName, id);
    }
    public abstract double calculateGPA();
}


