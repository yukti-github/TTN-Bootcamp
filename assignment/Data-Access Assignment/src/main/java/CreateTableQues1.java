import java.sql.*;

public class CreateTableQues1 {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, SQLException {

        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName).newInstance();

        String connectionString = "jdbc:mysql://localhost:3306/springDemo";
        String username = "yukti";
        String password = "Yukti@12";

        Connection connection = (Connection) DriverManager.getConnection(connectionString,
                username, password);

        //CREATING TABLE-

//        PreparedStatement table= connection.prepareStatement("Create table user(username varchar(20)
//         ,password varchar(20), name varchar(20), age int(5),DOB date)");
//        table.execute();
//
        //SOLUTION- 1 (INSERTING DATA INTO USER TABLE)

        PreparedStatement insertData = connection.prepareStatement("INSERT INTO user " +
                "VALUES ('Shivam12', 'Shivam2345', 'Shivam', 21,'1997-10-08')");

        insertData.executeUpdate();

    }
}
