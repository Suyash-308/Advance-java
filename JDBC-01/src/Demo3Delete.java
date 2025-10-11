import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Delete {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        Statement statement = connection.createStatement();

        String query = "delete from movie where id=4";
        statement.execute(query);
        connection.close();
        System.out.println("Successful");
    }
}
