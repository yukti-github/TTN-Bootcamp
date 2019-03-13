package Ques10;

import org.springframework.stereotype.Service;

@Service
public class ExpressTea implements HotDrink {
    private String drinkName;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public void prepareHotDrink(Integer price)
    {
        System.out.println("prepare hot drink express tea"+price);
    }


}