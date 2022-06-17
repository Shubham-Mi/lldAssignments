package designPatterns.builder;

public class Main {
    public static void main(String[] args) {

        User testUser = User.getBuilder()
                .setName("Shubham")
                .setEnglishMarks(82)
                .setMathsMarks(97)
                .setScienceMarks(95)
                .build();

        User testUser2 = User.getBuilder()
                .setName("Mittal")
                .setMathsMarks(92)
                .build();

        testUser.display();
        testUser2.display();

    }
}
