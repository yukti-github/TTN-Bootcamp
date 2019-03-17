package Ques10;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

@Service("main")
public class Main {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    SessionFactory sessionFactory;

    User getUser() {
        String sql = "SELECT * FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"YuktiSharma"}, new UserMapper());
    }

    void getUserByHql() {
        System.out.print("Number of records in user table = ");
        Query query = sessionFactory.openSession().createSQLQuery("Select count(*) from user");
        System.out.print(query.uniqueResult());

    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        Main main = context.getBean("main", Main.class);
        User user = main.getUser();
        System.out.println(user);
        main.getUserByHql();
    }}