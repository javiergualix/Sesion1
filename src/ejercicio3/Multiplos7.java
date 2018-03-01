package ejercicio3;
import java.util.*;

public class Multiplos7 extends Thread {

    private long x,y,suma = 0;

    public Multiplos7 (int x, int y) {
        this.x = x;
        this.y = y;
    }

    private boolean esMultiplo(long n) {
        boolean multiplo = false;
        int i = 7;

        if (n%i == 0) {
            multiplo = true;

        }
        return multiplo;

    }

    public void run() {
        for (long i = x; i<= y; i++) {
            if (esMultiplo(i)) {
                suma += i;
            }
        }
    }

    public long suma() {
        return suma;
    }


}

