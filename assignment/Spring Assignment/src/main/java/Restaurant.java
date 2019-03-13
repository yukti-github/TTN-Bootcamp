//Create a class Restaurant. Create an interface HotDrink with an abstract method prepareHotDrink.
//        Create two classes Tea and ExpressTea1 which implements HotDrink Class.
//        Create an instance variable of type HotDrink in Restaurant class.
//        Configure Tea and ExpressTea1 classes beans in Spring XML.
//        create a bean with the name teaRestaurant of type Restaurant
//        which inject Tea object as dependency using setter method.


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface HotDrink{
    void prepareHotDrink(Integer price);
}

class Tea implements HotDrink{
    private String drinkName;


    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public void prepareHotDrink(Integer price) {
        System.out.println("preparing hot tea of price= "+price+"Rs");

    }

    @Override
    public String toString() {
        return "Tea{" +
                "drinkName='" + drinkName + '\'' +
                '}';
    }
}


class ExpressTea implements HotDrink{

    private String drinkName;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "ExpressTea1{" +
                "drinkName='" + drinkName + '\'' +
                '}';
    }

    @Override
    public void prepareHotDrink(Integer price) {
        System.out.println("preparing express tea of price "+ price+" Rs");
    }
}
public class Restaurant {

    @Autowired
    HotDrink hotDrink;

    private String type;

    @Required @Autowired
    public Restaurant setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
        return this;
    }

    @Autowired
    public Restaurant(HotDrink hotDrink)
    {
        this.hotDrink=hotDrink;
    }


    public void setType(String type) {
        this.type = type;
    }

    public Restaurant() {
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ApplicationContext ctx1= new ClassPathXmlApplicationContext("Spring-config.xml");
        Restaurant restaurant = (Restaurant)ctx1.getBean("teaRestaurant");
        System.out.println(restaurant);
        restaurant.hotDrink.prepareHotDrink(20);

        System.out.println("*********");
        Restaurant restaurant1 = (Restaurant)ctx1.getBean("ExpressTeaRestaurant");
        System.out.println(restaurant1);
        restaurant1.hotDrink.prepareHotDrink(70);


       // byName
        Restaurant byNameTea = (Restaurant) ctx1.getBean("restaurantName");
        byNameTea.hotDrink.prepareHotDrink(40);

        //byType
  //     Restaurant byTypeTea = (Restaurant) ctx1.getBean("restaurantType");
    //   byTypeTea.hotDrink.prepareHotDrink(60);

      //byConstructor
//        Restaurant byConstructorTea= (Restaurant) ctx1.getBean("constructorRestaurant");
//        byConstructorTea.hotDrink.prepareHotDrink(90);

        //checking for prototype-
        ApplicationContext ctx2= new ClassPathXmlApplicationContext("Spring-config.xml");
        Restaurant restaurant2 = (Restaurant)ctx2.getBean("teaRestaurant");
        System.out.println(restaurant2);

    }

}
