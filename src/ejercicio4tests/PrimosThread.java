package ejercicio4tests;

public class PrimosThread implements Runnable {

    private int x,y,n=0;

    private Thread hilo;

    public PrimosThread(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private boolean esPrimo(int n) {
        int raiz = (int) Math.sqrt((double) n);
        boolean primo = true;
        int i=2;
        while (primo && i<= raiz)
        {
            if (n%i == 0) {
                primo=false;
            }
            i++;
        }
        return primo;
    }

    public void run() {
        for (int i=x; i<= y; i++) {
            if(esPrimo(i))
            {
                n++;
            }
        }
    }

    public int cuantos() {
        return n;
    }
}