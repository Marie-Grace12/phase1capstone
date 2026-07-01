import java.sql.*;

public class StudentDAO{

    public static void insertStudent(String name, String userName, int id)
            throws SQLException {
        String sql = "INSERT INTO students (name, userName,id) VALUES (?, ?, ?)";
        DatabaseMetaData DatabaseConnection = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, userName);
            stmt.setInt(3,id);
            stmt.executeUpdate();
        }
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
}



