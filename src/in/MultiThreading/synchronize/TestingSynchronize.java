package in.MultiThreading.synchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdateThread t1 = new UpdateThread(counter);
        UpdateThread t2 = new UpdateThread(counter);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Thread interrupted"+ e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value : %d and  time take : %d",counter.getCount(),(endTime-startTime));

    }
}
