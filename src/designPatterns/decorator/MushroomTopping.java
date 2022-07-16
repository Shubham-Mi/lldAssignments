package designPatterns.decorator;

public class MushroomTopping implements Pizza{
    private Pizza pizza;

    public MushroomTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice() + 25;
    }

    @Override
    public String getConstituents() {
        return this.pizza.getConstituents() + " Mushroom Topping";
    }
}
