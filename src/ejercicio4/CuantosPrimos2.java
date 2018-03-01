package ejercicio4;

import java.util.*;

public class CuantosPrimos2 {
    public static void main(String[] x) throws InterruptedException {
        long t0 = (new Date()).getTime(); //t0=instante de inicio de los cálculos
        Runnable p1 = new PrimosThread(1,200000);
        Runnable p2 = new PrimosThread(2000000,4000000);
        Runnable p3 = new PrimosThread(4000000,6000000);
        Runnable p4 = new PrimosThread(6000000,8000000);
        Runnable p5 = new PrimosThread(8000000,10000000);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        new Thread(p5).start();





        try {
            p1.join(); //esperamos a que terminen todos

        } catch (InterruptedException e) {}
        long t1 = (new Date()).getTime(); //t1 = instante de final de los cálculos
        System.out.printf("Número de primos menores que 10.000.000: " + n + " calculado en " + (t1-t0) + " miliseg.");
    }
}
