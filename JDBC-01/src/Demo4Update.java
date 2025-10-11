import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4Update {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        Statement statement = connection.createStatement();

        String query = "update movies set title='ravan' where id=2";
        statement.executeUpdate(query);
        connection.close();
        System.out.println("Successful");
    }
}
