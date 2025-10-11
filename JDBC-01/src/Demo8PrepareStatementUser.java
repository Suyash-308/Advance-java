import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo8PrepareStatementUser {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id and title");
        int id=scanner.nextInt();
        String title=scanner.next();

        String query = "insert into movie(id ,title )values(?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,title);

         preparedStatement.executeUpdate();
        connection.close();
        System.out.println("Successful");
    }
}
