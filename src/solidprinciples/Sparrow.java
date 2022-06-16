package assignments.solidprinciples;

public class Sparrow extends Bird implements Flyable{
    private FlyingBehaviour fl;
    Sparrow(FlyingBehaviour fl) {
        super("Sparrow");
        this.fl = fl;
    }

    Sparrow(FlyingBehaviour fl, String color, int weight) {
        super("Sparrow", color, weight);
        this.fl = fl;
    }

    @Override
    public void fly() {
        this.fl.makeFly(this.getColor(), this.getType());
    }
}
