package designPatterns.builder;

import java.security.InvalidParameterException;

public class User {
    private String name;
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;

    private User() {}

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("English marks: " + englishMarks);
        System.out.println("Maths marks: " + mathsMarks);
        System.out.println("Science marks: " + scienceMarks);
        System.out.println();
    }

    public static UserBuilder getBuilder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private int englishMarks = 35;
        private int mathsMarks = 35;
        private int scienceMarks = 35;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public User build() {
//            Validations

            if (name.isEmpty()) {
                throw new InvalidParameterException("Name cannot be empty");
            }

            if (englishMarks > 100 || englishMarks < 0 || mathsMarks > 100 || mathsMarks < 0 || scienceMarks > 100 || scienceMarks < 0) {
                throw new InvalidParameterException("Invalid marks entered");
            }

//            Creation of Object
            User user = new User();
            user.name = name;
            user.englishMarks = englishMarks;
            user.mathsMarks = mathsMarks;
            user.scienceMarks = scienceMarks;
            return user;
        }
    }
}
