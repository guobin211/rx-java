package io;

import java.sql.*;

/**
 * @author GuoBin201314@gmail.com on 2018/11/18 15:25
 */
public class JDBCClient {
    static final String JDBC_URL = "jdbc:mysql://193.112.133.62:3306";
    static final String JDBC_USER = "admin";
    static final String JDBC_PASSWORD = "admin888";
    public static void main(String[] args) {
        search();
    }

    /**
     * 查询
     */
    private static void search() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM USER"
            );
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
