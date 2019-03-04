//QUES 6- Implement Decorator pattern to decorate the Pizza with toppings.

package Ques6;

interface Pizza{
    String info();
}

class RegularPizza implements Pizza {
    private Integer servings;

    public RegularPizza(Integer servings) {
        this.servings = servings;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    @Override
    public String info() {
        return "\nA regular pizza with servings= "+servings;
    }
}

class SpecialPizza implements Pizza{
    private Integer servings;
    private String base;

    public SpecialPizza(Integer servings, String base) {
        this.servings = servings;
        this.base = base;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String info() {
        return "\nA special pizza with servings= "+servings+", type of base is= "+base;
    }
}
class VeggiesToppings implements Pizza{
    private Pizza pizza;
    private String topping;
    private boolean extraCheese;
    private boolean mixOfFourToppings;

    public VeggiesToppings(Pizza pizza, String topping, boolean extraCheese, boolean mixOfFourToppings) {
        this.pizza = pizza;
        this.topping = topping;
        this.extraCheese = extraCheese;
        this.mixOfFourToppings = mixOfFourToppings;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isMixOfFourToppings() {
        return mixOfFourToppings;
    }

    public void setMixOfFourToppings(boolean mixOfFourToppings) {
        this.mixOfFourToppings = mixOfFourToppings;
    }

    @Override
    public String info() {
        return pizza.info()+"\nVeggies on top with ="+topping+"\n extracheese needed= "+
                extraCheese+"\n mix of four toppings= "+mixOfFourToppings;
    }
}

public class Decorator{
    public static void main(String[] args) {

        VeggiesToppings pizza1 = new VeggiesToppings(new SpecialPizza(3,"plain"),"tomato",false,false);
        System.out.println(pizza1.info());

        VeggiesToppings pizza2= new VeggiesToppings(new RegularPizza(3),"all",true,true);
        System.out.println(pizza2.info());
    }
}