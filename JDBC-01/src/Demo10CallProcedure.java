import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo10CallProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS) ;
        Connection connection= DriverManager.getConnection(MysqlConstant.MYSQL_URL,MysqlConstant.MYSQL_USERNAME,MysqlConstant.MYSQL_PASSWORD);

        String query="call college.movie_proc()";
        CallableStatement callableStatement= connection.prepareCall(query);
        callableStatement.execute();

        connection.close();
        System.out.println("Call Successful");
    }
}
