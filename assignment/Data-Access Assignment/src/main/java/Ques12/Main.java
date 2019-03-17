package Ques12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.insert();
    }


}