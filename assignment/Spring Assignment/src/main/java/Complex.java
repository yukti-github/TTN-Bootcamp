import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex {
   private List list;
    private Map map;
    private Set set;

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "list=" + list +
                ", \nmap=" + map +
                ", \nset=" + set +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext complex= new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(complex.getBean("complex"));
    }
}
