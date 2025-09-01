package DesignPatterns.Singleton;

//✅ Thread-safe.
//✅ No synchronization overhead.
//✅ Clean & recommended approach.

public class SingletonBillPugh {
    private SingletonBillPugh() {
    }

    private static class Helper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Helper.INSTANCE;
    }
}
