import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomEvent1 extends ApplicationEvent {
    CustomEvent1(Object object) {
        super(object);
    }

    @Override
    public String toString() {
        return "CustomEvent1{" +
                "source=" + source +
                '}';
    }
}

class CustomEventListener implements ApplicationListener<CustomEvent1> {
    @Override
    public void onApplicationEvent(CustomEvent1 event) {
        System.out.println(event.toString());
    }
}

public class Ques2 implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;
    void display() {
        CustomEvent1 customEvent = new CustomEvent1(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("Display");
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("Spring-config.xml");
        Ques2 customEvent = (Ques2) ctx.getBean("lst");
        customEvent.display();
    }
}
