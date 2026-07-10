import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDAO {
    private Connection connection;

    public CourseDAO() throws SQLException {
        connection = DataConnection.createConnection();
    }
    public void createTable() throws SQLException {
        String createSql = """
                create table Course(
                id int primary key,
                course_name varchar(20),
                course_code varchar(34)
                )
                """;
        PreparedStatement statement = connection.prepareStatement(createSql);
        statement.executeUpdate();
        System.out.println("table is created");
    }
    public void insertValues(Course course) throws SQLException {
        String insertSql = " insert into Course(id,course_name,course_code)values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(insertSql);
        statement.setInt(1,course.getCredit());
        statement.setString(2,course.getCourseName());
        statement.setString(3,course.getCourseCode());
        statement.executeUpdate();
        System.out.println("values are inserted");
    }
}
