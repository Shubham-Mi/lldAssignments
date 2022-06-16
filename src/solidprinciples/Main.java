package assignments.solidprinciples;

public class Main {
    public static void main(String[] args) {
        Pigeon pigeon1 = new Pigeon(new FlyingBehaviourType1());
        Crow crow1 = new Crow(new FlyingBehaviourType2());
        Sparrow sparrow1 = new Sparrow(new FlyingBehaviourType2());
        Penguin penguin1 = new Penguin();
        Ostrich ostrich1 = new Ostrich();

//        pigeon
        pigeon1.eat();
        pigeon1.makeSound();
        pigeon1.fly();

//        crow
        crow1.eat();
        crow1.makeSound();
        crow1.fly();

//        sparrow
        sparrow1.eat();
        sparrow1.makeSound();
        sparrow1.fly();

//        penguin
        penguin1.eat();
        penguin1.makeSound();

//        ostrich
        ostrich1.eat();
        ostrich1.makeSound();
    }
}
