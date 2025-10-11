import java.sql.*;

public class Demo6Read {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(MySqlConstant.MYSQL_DRIVER_CLASS);

        Connection connection= DriverManager.getConnection(MySqlConstant.MYSQL_URL,MySqlConstant.MYSQL_USERNAME,MySqlConstant.MYSQL_PASSWORD);

        Statement statement=connection.createStatement();

        String query="select * from studentRegistration";

       ResultSet resultSet= statement.executeQuery(query);

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+"\t"+
                    resultSet.getString("name")+"\t"+
                    resultSet.getString("address")+"\t"+
                    resultSet.getString("email")+"\t"+
                    resultSet.getInt("phone")

            );
        }
        connection.close();

    }
}
