package Challenge.Thread.ThreadState;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadStates t1 = new ThreadStates();
        ThreadStates t2 = new ThreadStates();
        System.out.printf("\nCreate the thread %s",t1.getState());
        t1.start();
        t1.join();
        System.out.printf(" \n thread finished %s", t1.getState());
    }
}
