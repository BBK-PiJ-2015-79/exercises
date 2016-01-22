package singleton;

public class DCLockingSingleton {
    private static volatile DCLockingSingleton uniqueInstance;

    private DCLockingSingleton() {
        // private constructor
    }

    private static DCLockingSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (DCLockingSingleton.class) {
                uniqueInstance = new DCLockingSingleton();
            }
        }
        return uniqueInstance;
    }
}
