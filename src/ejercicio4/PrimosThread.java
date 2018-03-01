package ejercicio4;

import java.util.*;
import java.util.concurrent.*;



public class PrimosThread implements Runnable {

    private int x,y,n=0;


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
        try {
            Thread.sleep(numeroRandom(1000, 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static int numeroRandom(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public int cuantos() {
        return n;
    }
}
