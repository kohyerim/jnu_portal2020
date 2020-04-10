package kr.ac.jejunu.user;

import javax.imageio.event.IIOReadProgressListener;
import javax.xml.transform.Result;
import java.sql.*;

public class UserDao {
    public User get(Integer id) throws ClassNotFoundException, SQLException {
        // mysql
        // driver 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        // connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb?serverTimezone=Asia/Seoul", "hyerim", "1234");
        // query
        PreparedStatement preparedStatement = connection.prepareStatement("select id, name, password from userinfo where id = ?");
        preparedStatement.setInt(1, id);
        // 실행
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        // 결과 매핑
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password"));
        // 자원해지
        resultSet.close();
        preparedStatement.close();
        connection.close();
        // 결과리턴
        return user;
    }
}
