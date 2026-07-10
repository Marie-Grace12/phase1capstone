import java.sql.*;

public class StudentDAO{
    private Connection connection;
    public StudentDAO()throws SQLException{
        connection=DataConnection.createConnection();
    }

    public static void insertStudent(String john, String mail, int i) {
    }

    public void createTable() throws SQLException {

    }
    public void insertValues(Student student)throws SQLException{
        String insertSql="insert into Student (id,name,user_name)values(???)";
        PreparedStatement statement=connection.prepareStatement(insertSql);
        statement.setInt(1,student.getId());
        statement.setString(2,student.getName());
        statement.setString(3,student.getUserName());
        statement.executeUpdate();
        System.out.println("values are inserted");
    }

    public static void enrollstudent(int id, String courseCode) throws SQLException {
        String sql = "INSERT INTO enrollments (studentid, coursecode) VALUES (?, ?)";
        DatabaseMetaData DatabaseConnection = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1,id);
            stmt.setString(2, courseCode);
            stmt.executeUpdate();
        }
    }

    public static void viewEnrollments() throws SQLException {
        String sql = "SELECT s.id, s.name, c.coursecode " +
                "FROM students s " +
                "JOIN enrollments e ON s.id = e.id " +
                "JOIN courses c ON e.coursecode = c.coursecode";

        Statement DatabaseConnection = null;
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("--- Current Student Enrollments (DB JOIN) ---");
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt("id") +
                        " | Name: " + rs.getString("name") +
                        " | Enrolled In: " + rs.getString("title") +
                        " (" + rs.getString("course_code") + ")");
            }
        }
    }

    public void insertvalues(Student student) {
    }
}




