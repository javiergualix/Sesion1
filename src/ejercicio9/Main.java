package ejercicio9;

class Main {
    public static void main(String args[]) {
        for (int i = 0; i <= 1000; i++) {
            new NewThread(i);
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Terminado");
    }

}

