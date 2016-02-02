package singleton;

public class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
        // private constructor
    }

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
