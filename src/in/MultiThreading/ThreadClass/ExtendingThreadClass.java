package in.MultiThreading.ThreadClass;

import in.MultiThreading.ThreadClass.FirstTask;
import in.MultiThreading.ThreadClass.SecondTask;
import in.MultiThreading.ThreadClass.ThirdTask;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3  = new ThirdTask();
        t1.start();
        t2.start();
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s Total time taken : %s",(endTime-startTime),Thread.currentThread().getName());
    }
}
