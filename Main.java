package m8.FINAL;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        UpCounterThread upCounterThread = new UpCounterThread(counter);
        DownCounterThread downCounterThread = new DownCounterThread(counter);

        upCounterThread.start();
        try {
            upCounterThread.join(); // wait for upCounterThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        downCounterThread.start();
    }
}