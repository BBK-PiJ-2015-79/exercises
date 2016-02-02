package singleton;

public class LazySingleton {
    private static LazySingleton uniqueInstance;

    private LazySingleton() {
        // private constructor
    }

    public static LazySingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }

}
