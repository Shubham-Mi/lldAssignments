package designPatterns.decorator;

import java.security.InvalidParameterException;

public class PanCrust implements Pizza{
    private Pizza pizza;

    public PanCrust(Pizza pizza) {
        if (pizza.getConstituents().contains("Topping")) {
            throw new InvalidParameterException();
        }
        this.pizza = pizza;
    }

    public PanCrust() {}

    @Override
    public int getPrice() {
        int cost = 125;
        if (this.pizza != null)
            cost += this.pizza.getPrice();
        return cost;
    }

    @Override
    public String getConstituents() {
        String constituents = "Pan Crust";

        if (this.pizza != null)
            constituents += (" " + this.pizza.getConstituents());

        return constituents;
    }
}
