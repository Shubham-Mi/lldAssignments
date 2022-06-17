package designPatterns.singleton;

public class SingletonExample {
    private final String testAttribute = "Singleton Example";
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    public void showSingleton() {
        System.out.println("This is a singleton class");
    }
}
