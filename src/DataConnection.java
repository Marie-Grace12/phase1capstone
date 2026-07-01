import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
    public static Connection createConnection() throws SQLException{
        Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/UniversityManagementSystem" ,"postgres" , "Grace");
        return conn;
    }


    }
