package designPatterns.decorator;

public class PepperoniTopping implements Pizza{
    private Pizza pizza;

    public PepperoniTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice() + 35;
    }

    @Override
    public String getConstituents() {
        return this.pizza.getConstituents() + " Pepperoni Topping";
    }
}
