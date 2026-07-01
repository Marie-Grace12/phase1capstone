import java.util.*;

public class Collection {
    public Map<Integer,Instructor> getInstructors() {
        return instructor;
    }
    Map<Integer,Student>student=new HashMap<>();
    Map<Integer,Instructor>instructor=new HashMap<>();
    Map<Integer,Course>course=new HashMap<>();
    //public List<Student> student=new ArrayList<>((HashMap<Integer, Student>) student);
    public Set<Course>courses = new HashSet<>();


    public void registerStudents(Student student){
        System.out.println(student.getName());
    }
    public void addCourses(Course course ){
        System.out.println(course.getCourseName());
    }

}
