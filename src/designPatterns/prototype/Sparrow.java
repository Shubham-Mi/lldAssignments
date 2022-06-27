package designPatterns.prototype;

public class Sparrow extends Bird{
    private int  legLength;

    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    public Sparrow() {}

    private Sparrow(Sparrow old) {
        super(old);
        this.legLength = old.legLength;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
