package DesignPatterns.Singleton;

//✅ Thread-safe.
//❌ Slower due to synchronization on every call.

public class SingletonLazySynchronized {
    private static SingletonLazySynchronized instance;

    private SingletonLazySynchronized() {
    }

    public static synchronized SingletonLazySynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonLazySynchronized();
        }
        return instance;
    }
}
