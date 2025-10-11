import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo9CreateProcedure {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        String query = "create procedure college.movie_proc() begin " +
                "insert into movie(id,title) values(11,'2.0'); end";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();

        connection.close();
        System.out.println("Successful");
    }
}
