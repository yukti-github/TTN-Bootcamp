package Ques3and4;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserDAO {

    @Autowired
    DataSource dataSource;

    @Autowired
    SingleConnectionDataSource singleConnectionDataSource;

    @Autowired
    BasicDataSource basicDataSource;

    void printUser() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username") + ", " +
                    resultSet.getString("password") + ", " +
                    resultSet.getString("name") + ", " +
                    resultSet.getString("age") + ", " +
                    resultSet.getString("DOB") + " "
                    );
        }
    }

    void printUserSingleCon() throws SQLException {
        Connection connection = singleConnectionDataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username") + ", " +
                    resultSet.getString("password") + ", " +
                    resultSet.getString("name") + ", " +
                    resultSet.getString("age") + ", " +
                    resultSet.getString("DOB") + " "
            );
        }
    }

    void printUserBasicDataSource() throws SQLException {
        Connection connection = basicDataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username") + ", " +
                    resultSet.getString("password") + ", " +
                    resultSet.getString("name") + ", " +
                    resultSet.getString("age") + ", " +
                    resultSet.getString("DOB") + " "
            );
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDAO obj = context.getBean(UserDAO.class);
        try {
            obj.printUser();
            System.out.println("************************************");
            obj.printUserSingleCon();
            System.out.println("**************************************");
            obj.printUserBasicDataSource();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
