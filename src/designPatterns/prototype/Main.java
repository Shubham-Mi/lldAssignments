package designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.setColor("White");
        bird1.setName("Tweety");
        bird1.setWeight(10);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("Black");
        sparrow1.setLegLength(10);

        Crow crow1 = new Crow();
        crow1.setSound("kaw");
        crow1.setWeight(20);

        List<Bird> birds = List.of(
                bird1,
                sparrow1,
                crow1
        );

        List<Bird> children = new ArrayList<>();

        for (Bird parent: birds) {
            children.add(parent.clone());
        }

        System.out.println("Prototype design pattern implemented");
    }
}
