import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo7InsertUserInput {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        Statement statement = connection.createStatement();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id and title");
        int id=scanner.nextInt();
        String title=scanner.next();

        String query = "insert into movie(id ,title )values(" + id + ",'" + title + "')";
        statement.executeUpdate(query);
        connection.close();
        System.out.println("Successful");
    }
}
