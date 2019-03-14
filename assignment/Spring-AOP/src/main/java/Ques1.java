import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx1 = new ClassPathXmlApplicationContext("Spring-config.xml");
        ctx1.start();
        Dummy dummy = ctx1.getBean("dummy", Dummy.class);
        dummy.display();
        ctx1.stop();
        ctx1.close();
    }
}
  class Dummy {
    public void display() {
        System.out.println("Displaying from dummy class");
    }
}
