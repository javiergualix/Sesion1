package ejercicio4beta2;

import java.util.Date;

public class CuantosPrimos2 {
    public static void main(String[] x) {
        long t0 = (new Date()).getTime(); //t0=instante de inicio de los cálculos
        PrimosThread p = new PrimosThread(1,10000000);
        Thread t = new Thread(p);
        PrimosThread p3 = new PrimosThread(4000000,6000000);

        t.start();
        try {
            t.join();; //esperamos a que terminen todos

        } catch (InterruptedException e) {}
        int n = p.cuantos();
        long t1 = (new Date()).getTime(); //t1 = instante de final de los cálculos
        System.out.printf("Número de primos menores que 10.000.000: " + n + " calculado en " + (t1-t0) + " miliseg.");
    }
}
