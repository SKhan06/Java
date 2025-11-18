package in.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingRunnable {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        PrintRunnable task = new PrintRunnable('S');
        executor.submit(task);
        executor.shutdown();


    }
}
