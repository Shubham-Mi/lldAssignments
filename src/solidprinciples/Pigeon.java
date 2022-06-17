package solidprinciples;

public class Pigeon extends Bird implements Flyable{
    private FlyingBehaviour fl;
    Pigeon(FlyingBehaviour fl) {
        super("Pigeon");
        this.fl = fl;
    }

    Pigeon(FlyingBehaviour fl, String color, int weight) {
        super("Pigeon", color, weight);
        this.fl = fl;
    }

    @Override
    public void fly() {
        this.fl.makeFly(this.getColor(), this.getType());
    }
}
