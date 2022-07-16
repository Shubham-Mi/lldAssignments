package designPatterns.decorator;

import java.security.InvalidParameterException;

public class NormalCrust implements Pizza{
    private Pizza pizza;

    public NormalCrust() {}

    public NormalCrust(Pizza pizza) {
        if (pizza.getConstituents().contains("Topping")) {
            throw new InvalidParameterException();
        }
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        int cost = 100;
        if (this.pizza != null)
            cost += this.pizza.getPrice();
        return cost;
    }

    @Override
    public String getConstituents() {
        String constituents = "Normal Crust";

        if (this.pizza != null)
            constituents += (" " + this.pizza.getConstituents());

        return constituents;
    }
}
