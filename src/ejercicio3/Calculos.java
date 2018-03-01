package ejercicio3;

import ejemplo1.Primos;

import java.util.*;


public class Calculos {
    public static void main(String[] x) {
        long t0 = (new Date()).getTime(); //t0=instante de inicio de los cálculos
        Multiplos7 m1 = new Multiplos7(1,10000);
        Suma3y5 s1 = new Suma3y5(1,10000);
        PrimosThread p1 = new PrimosThread(1,10000);
        m1.start();
        s1.start();
        p1.start();

        try {
            m1.join();s1.join();p1.join(); //esperamos a que terminen todos

        } catch (InterruptedException e) {}
        long n = m1.suma();
        long t1 = (new Date()).getTime(); //t1 = instante de final de los cálculos
        long n1 = s1.suma();
        long t2 = (new Date()).getTime(); //t1 = instante de final de los cálculos
        long n2 = p1.suma();
        long t3 = (new Date()).getTime(); //t1 = instante de final de los cálculos

        System.out.println("Suma de múltiplos de 7 menores que 10.000: " + n + " calculado en " + (t1-t0) + " miliseg.");
        System.out.println("Suma de números terminados en 3 y 5 menores que 10.000: " + n1 + " calculado en " + (t2-t0) + " miliseg.");
        System.out.println("Suma de primos menores que 10.000: " + n2 + " calculado en " + (t3-t0) + " miliseg.");

    }
}

