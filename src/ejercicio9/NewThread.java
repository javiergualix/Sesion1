package ejercicio9;

public class NewThread implements Runnable {
    String name; // name of thread

    Thread t;

    NewThread (int threadname) {
        name = String.valueOf(threadname);
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }

    public void run() {
        try {
            System.out.println(name + ": " + Thread.currentThread().getName());
            Thread.currentThread().join();

        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
    }
}

