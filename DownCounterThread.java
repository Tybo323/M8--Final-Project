package m8.FINAL;

class DownCounterThread extends Thread {
    private Counter counter;

    public DownCounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            counter.decrement();
        }
    }
}
