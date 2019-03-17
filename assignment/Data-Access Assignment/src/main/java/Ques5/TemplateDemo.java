package Ques5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Date;

@Repository
public class TemplateDemo {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    void userCount() {
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println("number of users are- "+jdbcTemplate.queryForObject(sql, Integer.class));
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        TemplateDemo count = context.getBean(TemplateDemo.class);
        count.userCount();

        //Solution-6
        String sql2 = "SELECT NAME FROM user WHERE username = ?";
        System.out.println("Name of this user is- "+
                count.jdbcTemplate.queryForObject(sql2, new Object[]{"YuktiSharma"}, String.class));

        //Solution 7
//        String sql3 = "INSERT INTO user VALUES(?,?,?,?,?)";
//        count.jdbcTemplate.update(sql3, new Object[]{
//                "Riya29", "abcd", "RIYA", 21, new Date()
//        });

        //Solution- 8
        String sql4 = "SELECT * FROM user WHERE username = ?";
        System.out.println(count.jdbcTemplate.queryForMap(sql4,new Object[]{"YuktiSharma"}));


        //Solution- 9
        String sql5 = "SELECT * FROM user";
        System.out.println(count.jdbcTemplate.queryForList(sql5));
    }
}
