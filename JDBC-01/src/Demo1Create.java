import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1Create {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        Statement statement = connection.createStatement();

        String query = "create table movie(id int primary key,title varchar(100))";
        statement.execute(query);
        connection.close();
        System.out.println("Table created");
    }
}