import java.sql.*;

public class Demo10 {
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
