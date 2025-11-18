package in.MultiThreading.join;

import in.MultiThreading.runnables.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException{
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s %d task complete ", Thread.currentThread().getName(),(endTime-startTime
        ));





    }
}
