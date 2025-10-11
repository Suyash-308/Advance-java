import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Drop {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(MySqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection= DriverManager.getConnection(MySqlConstant.MYSQL_URL,MySqlConstant.MYSQL_USERNAME,MySqlConstant.MYSQL_PASSWORD);

        Statement statement=connection.createStatement();

        String query="drop table studentRegistration";

        statement.executeUpdate(query);
        connection.close();
        System.out.println("drope");
    }
}
