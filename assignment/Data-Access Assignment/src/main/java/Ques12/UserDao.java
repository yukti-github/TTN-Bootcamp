package Ques12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Date;

@Service
public class UserDao {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDao2 userDao2;
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, timeout = 9)
    public void insert() {

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {

        }

        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "xyz", "xyz", "xyz", 19, new Date()
        });
        try {
            userDao2.insert();
        } catch (Exception ex) {

        }
    }

}