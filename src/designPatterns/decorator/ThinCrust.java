package designPatterns.decorator;

import java.security.InvalidParameterException;

public class ThinCrust implements Pizza{
    private Pizza pizza;

    public ThinCrust(Pizza pizza) {
        if (pizza.getConstituents().contains("Topping")) {
            throw new InvalidParameterException();
        }
        this.pizza = pizza;
    }

    public ThinCrust() {}

    @Override
    public int getPrice() {
        int cost = 150;
        if (this.pizza != null)
            cost += this.pizza.getPrice();
        return cost;
    }

    @Override
    public String getConstituents() {
        String constituents = "Thin Crust";

        if (this.pizza != null)
            constituents += (" " + this.pizza.getConstituents());

        return constituents;
    }
}
