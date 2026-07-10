import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
            throws SQLException {
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO= new CourseDAO();
        Student student = new Student("Aline", "aline@gmail.com,2") {
            @Override
            public double calculateGPA() {
                return 0;
            }
        };
        studentDAO.insertvalues(student);
    }


      throws void SQLException{
        CourseDAO courseDAO = null;
        try {
            courseDAO = new CourseDAO();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Course course = new Course(2,"networking","cs101");
        try {
            courseDAO.insertValues(course);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        Scanner scanner = new Scanner(System.in);
    boolean running=true;
        while(running ) {
            System.out.println("===== University Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll Student in Course");
            System.out.println("3. View Enrolled Courses ");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Type (Undergraduate/Graduate): ");
                        String type = scanner.nextLine();

                        StudentDAO.insertStudent("john","john@gmail.com",9);
                        System.out.println("Student added securely!");
                        break;

                    case 2:
                        System.out.print("Enter Student ID: ");
                        int studentId = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Course Code: ");
                        String courseCode = scanner.nextLine();

                        StudentDAO.enrollstudent(8,"A1");
                        System.out.println("Enrollment complete!");
                        break;

                    case 3:
                        StudentDAO.viewEnrollments();
                        break;

                    case 4:
                        System.out.println("Exiting Application.");{
                            running=false;
                            break;
                        }


                    default:
                        System.out.println("Invalid option. Please choose 1-4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please input a valid numeric choice.");
            } catch (Exception e) {
                System.out.println("Database Error occurred: " + e.getMessage());
            }
        }
       // Person person = new Person("aline", "aline@gmail.com", 12);
//       Undergraduate student1 = new Undergraduate("joy", "joy@gmail.com", 23, 78.4, 89.2, 83.2);
//        System.out.println(student1.getName() + "GPA:" + student1.calculateGPA());
//       student1.calculateGPA();
//        Graduate student2 = new Graduate("john", "john@gmail.com", 34, 85);
//        System.out.println(student2.getName() + "GPA:" + student2.calculateGPA());
//        student2.calculateGPA();
        Instructor instructor = new Instructor("head of department", "school@gmail.com", 11, "EHS", 07);
        DataConnection conn= new DataConnection();


    }

