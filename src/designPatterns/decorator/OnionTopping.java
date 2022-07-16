package designPatterns.decorator;

public class OnionTopping implements Pizza{
    private Pizza pizza;

    public OnionTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice() + 20;
    }

    @Override
    public String getConstituents() {
        return this.pizza.getConstituents() + " Onion Topping";
    }
}
