package in.ExecutorService;

public class PrintRunnable implements Runnable{
    private final char targetChar;
    public PrintRunnable(char targetChar){
        this.targetChar=targetChar;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.printf("%d : %c ",i,targetChar);
        }
        System.out.printf("\n%s %c Task Done \n ",Thread.currentThread().getName(),targetChar);
    }
}
