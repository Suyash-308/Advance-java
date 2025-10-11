import java.sql.*;

public class Demo6Select {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName(MysqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection = DriverManager.getConnection(MysqlConstant.MYSQL_URL, MysqlConstant.MYSQL_USERNAME, MysqlConstant.MYSQL_PASSWORD);

        Statement statement = connection.createStatement();

        String query = "select * from movie";
        ResultSet resultSet= statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+"\t"+
                    resultSet.getString("title"));
        }

        connection.close();

    }
}
