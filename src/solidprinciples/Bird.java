package assignments.solidprinciples;

import java.util.Locale;

public abstract class Bird {
    private String color;
    private String type;
    private int weight;

    Bird(String type) {
        this.type = type;
        this.color = "white";
        this.weight = 10;
    }

    Bird(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("A " + this.color + " coloured " + this.type.toLowerCase() + " is eating.");
    }

    public void makeSound() {
        System.out.println("A " + this.color + " coloured " + this.type.toLowerCase() + " is making a sound.");
    }
}
