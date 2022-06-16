package assignments.solidprinciples;

public class FlyingBehaviourType1 implements FlyingBehaviour{
    @Override
    public void makeFly(String birdColor, String birdType) {
        System.out.println("A " + birdColor + " coloured " + birdType.toLowerCase() + " is flying with type 1 behaviour.");
    }
}
