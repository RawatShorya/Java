package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        
        try (ExecutorService executorService = Executors.newFixedThreadPool(3)) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }

    }
}
