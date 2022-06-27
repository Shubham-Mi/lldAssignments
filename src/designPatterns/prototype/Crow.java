package designPatterns.prototype;

public class Crow extends Bird{
    private String sound;

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Crow() {}

    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }

    @Override
    public Crow clone() {
        return new Crow(this);
    }
}
