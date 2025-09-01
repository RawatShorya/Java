package DesignPatterns.Singleton;

//✅ Thread-safe by default (class loading is synchronized).
//❌ Not suitable if instance creation is heavy and not always required.

public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
