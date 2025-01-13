package m8.FINAL;

class UpCounterThread extends Thread {
    private Counter counter;

    public UpCounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            counter.increment();
        }
    }
}

