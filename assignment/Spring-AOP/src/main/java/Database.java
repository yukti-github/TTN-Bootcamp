//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Database implements ApplicationListener{
//
//    void Connect(int port, String name)
//    {
//        System.out.println("\n connected to port number-"+ port+" of name "+name);
//    }
//
//    @Override
//    public void onApplicationEvent(ApplicationEvent event) {
//        System.out.println("\nrunning start event "+event);
//    }
//
//
//    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("Spring-config.xml");
//        ctx.start();
//        Database database = (Database) ctx.getBean("db");
//        database.Connect(10001,"mysql");
//        ctx.stop();
//        ctx.close();
//
//
//    }
//}

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomEventDatabase extends ApplicationEvent {
    CustomEventDatabase(Object object) {
        super(object);
    }

    @Override
    public String toString() {
        return "CustomEventDatabase{" +
                "source=" + source +
                '}';
    }
}

class DatabaseEventListener implements ApplicationListener<CustomEventDatabase> {
    @Override
    public void onApplicationEvent(CustomEventDatabase event) {
        System.out.println("Event triggered- "+event.toString());
    }
}

public class Database implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;
    void connect(int port) {
        CustomEventDatabase customEvent = new CustomEventDatabase(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Connected to port number"+port);
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("Spring-config.xml");
        Database customEvent2 = (Database) ctx.getBean("db");
        customEvent2.connect(9);
    }
}
