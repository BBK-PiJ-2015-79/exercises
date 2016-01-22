package singleton;

public class SychronisedSingleton {
    private static SychronisedSingleton uniqueInstance;

    private SychronisedSingleton(){
        //private constructor
    }

    public static synchronized SychronisedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SychronisedSingleton();
        }
        return uniqueInstance;
    }
}
