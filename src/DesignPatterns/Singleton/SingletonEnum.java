package DesignPatterns.Singleton;

//✅ Simplest + inherently thread-safe.
//✅ Protects against reflection and serialization issues.
//❌ Doesn’t allow lazy initialization (created at class load).
//❌ Harder to extend (no inheritance).

public enum SingletonEnum {
    INSTANCE;

    public void showMessage() {
        System.out.println("hello");
    }
}
