package in.MultiThreading.sleep;

public class TestingSleep {
    public static void main(String[] args) {
        System.out.println("Before Sleeping");

        try {
            Thread.sleep(10000);
            System.out.println("After Sleeping ");
        }catch (InterruptedException e){
            System.out.println("Thread Exception");
        }
    }
}
