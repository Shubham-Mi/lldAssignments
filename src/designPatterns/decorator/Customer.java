package designPatterns.decorator;

public class Customer {
    public static void main(String[] args) {
        Pizza pizza1 = new MushroomTopping(
                new MushroomTopping(
                        new OlivesTopping(
                                new PaneerTopping(
                                        new NormalCrust(
                                                new ThinCrust()
                                        )
                                )
                        )
                )
        );

        System.out.println(pizza1.getPrice());
        System.out.println(pizza1.getConstituents());
    }
}
