import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2Insert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        Statement statement = connection.createStatement();

        String query = "insert into movie(id ,title )values(78,'bahubali')";
        statement.executeUpdate(query);
        connection.close();
        System.out.println("Successful");
    }
}
