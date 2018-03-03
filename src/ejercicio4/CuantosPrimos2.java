package ejercicio4;

import java.util.Date;

public class CuantosPrimos2 {
    public static void main(String[] x) {
        long ti = (new Date()).getTime(); //t0=instante de inicio de los cálculos
        PrimosThread p = new PrimosThread(1,10000);
        Thread t1 = new Thread(p);
        Multiplos7 q = new Multiplos7(1,10000);
        Thread t2 = new Thread(q);
        Suma3y5 s = new Suma3y5(1,10000);
        Thread t3 = new Thread(s);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join(); t2.join(); t3.join(); //esperamos a que terminen todos

        } catch (InterruptedException e) {}
        int n1 = p.cuantos();
        long n2 = q.suma();
        long n3 = s.suma();
        long tf = (new Date()).getTime(); //t1 = instante de final de los cálculos
        System.out.println("Número de primos menores que 10.000: " + n1 + " calculado en " + (tf-ti) + " miliseg.");
        System.out.println("Suma de múltiplos de 7 menores que 10.000: " + n2 + " calculado en " + (tf-ti) + " miliseg.");
        System.out.println("Suma de números terminados en 3 y 5 menores que 10.000: " + n3 + " calculado en " + (tf-ti) + " miliseg.");
    }
}
