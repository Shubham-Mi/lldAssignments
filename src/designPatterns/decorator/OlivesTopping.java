package designPatterns.decorator;

public class OlivesTopping implements Pizza{
    private Pizza pizza;

    public OlivesTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice() + 30;
    }

    @Override
    public String getConstituents() {
        return this.pizza.getConstituents() + " Olives Topping";
    }
}
