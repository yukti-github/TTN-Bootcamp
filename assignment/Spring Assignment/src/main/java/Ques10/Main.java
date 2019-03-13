package Ques10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx4 = new ClassPathXmlApplicationContext("Spring-config.xml");
        Tea tea1 = ctx4.getBean("tea", Tea.class);
        tea1.setDrinkName("chaii");
        System.out.println(tea1);

        Restaurant restaurant1 = ctx4.getBean("restaurant", Restaurant.class);

        restaurant1.hotDrink.prepareHotDrink(9);
    }
}
