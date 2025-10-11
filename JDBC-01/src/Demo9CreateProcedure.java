import java.sql.*;

public class Demo9CreateProcedure {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        String query = "create procedure college.movie_proc() begin " +
                "insert into movie(id,title) values(111,'ram'); end";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();

        connection.close();
        System.out.println("Successful");
    }
}
