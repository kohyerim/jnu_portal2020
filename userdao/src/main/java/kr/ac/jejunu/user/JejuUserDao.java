package kr.ac.jejunu.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JejuUserDao extends UserDao {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // connection
        return DriverManager.getConnection("jdbc:mysql://localhost/mydb?serverTimezone=Asia/Seoul", "hyerim", "1234");
    }
}
