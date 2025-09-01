package DesignPatterns.Singleton;


//✅ Saves memory (created only when needed).
//❌ Multiple threads may create multiple instances.

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
