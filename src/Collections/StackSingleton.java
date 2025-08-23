package Collections;

import java.util.Stack;

class StackSingleton {
    private static final Stack<Integer> INSTANCE = new Stack<>();

    private StackSingleton() {}

    public static Stack<Integer> getInstance() {
        return INSTANCE;
    }
}

