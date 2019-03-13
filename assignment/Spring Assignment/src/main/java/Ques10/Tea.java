package Ques10;

import org.springframework.stereotype.Service;

@Service("tea")
public class Tea implements HotDrink {
    private String drinkName;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName( String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "drinkName='" + drinkName + '\'' +
                '}';
    }

    @Override
    public void prepareHotDrink(Integer price)
    {
        System.out.println("prepare hot drink tea of price and "+price);
    }
}