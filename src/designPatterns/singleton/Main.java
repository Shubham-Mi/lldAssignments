package designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample test1 = SingletonExample.getInstance();
        SingletonExample test2 = SingletonExample.getInstance();
        SingletonExample test3 = SingletonExample.getInstance();
        test1.showSingleton();
        test2.showSingleton();
        test3.showSingleton();
    }
}
