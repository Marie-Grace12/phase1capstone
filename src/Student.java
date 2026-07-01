public abstract class Student extends Person{

    public Student(String name, String userName, int id) {
        super(name, userName, id);
    }
    public abstract double calculateGPA();
}


