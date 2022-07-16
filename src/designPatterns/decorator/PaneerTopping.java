package designPatterns.decorator;

public class PaneerTopping implements Pizza{
    private Pizza pizza;

    public PaneerTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice() + 50;
    }

    @Override
    public String getConstituents() {
        return this.pizza.getConstituents() + " Paneer Topping";
    }
}
