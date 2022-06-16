package assignments.solidprinciples;

public class Crow extends Bird implements Flyable{
    private FlyingBehaviour fl;
    Crow(FlyingBehaviour fl) {
        super("Crow");
        this.fl = fl;
    }

    Crow(FlyingBehaviour fl, String color, int weight) {
        super("Crow", color, weight);
        this.fl = fl;
    }

    @Override
    public void fly() {
        this.fl.makeFly(this.getColor(), this.getType());
    }
}
