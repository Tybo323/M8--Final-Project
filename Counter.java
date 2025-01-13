package m8.FINAL;

class Counter {
    private int count;

    public synchronized void increment() {
        count++;
        System.out.println("Count up: " + count);
    }

    public synchronized void decrement() {
        count--;
        System.out.println("Count down: " + count);
    }
}

