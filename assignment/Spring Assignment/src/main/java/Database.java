import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Database {
    private int port;
    private String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ApplicationContext ctx1= new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(ctx1.getBean("db"));

        //Question 2
        Database connection= (Database) ctx1.getBean("db");
        System.out.println("Name of port is- "+connection.name+" \nPort number is- "+connection.port);
    }
}
