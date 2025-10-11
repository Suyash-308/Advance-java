import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1Create {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(MySqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection= DriverManager.getConnection(MySqlConstant.MYSQL_URL,MySqlConstant.MYSQL_USERNAME,MySqlConstant.MYSQL_PASSWORD);

        Statement statement=connection.createStatement();

        String query="create table studentRegistration( id int primary key,name varchar(100),address varchar(100),email varchar(100),phone varchar(100))";

        statement.executeUpdate(query);
        connection.close();
        System.out.println("Table created");
    }
}
