package ejercicio1;

import java.util.Date;

public class CuantosPrimos1 {
    public static void main (String[] x) {
        long ti = (new Date()).getTime(); //t0=instante de inicio de los cálculos
        Primos p1 = new Primos(1,2000000);
        Primos p2 = new Primos(2000000,4000000);
        Primos p3 = new Primos(4000000,6000000);
        Primos p4 = new Primos(6000000,8000000);
        Primos p5 = new Primos(8000000,10000000);
        long t0 = (new Date()).getTime();
        p1.calcular();
        long t1 = (new Date()).getTime();
        p2.calcular();
        long t2 = (new Date()).getTime();
        p3.calcular();
        long t3 = (new Date()).getTime();
        p4.calcular();
        long t4 = (new Date()).getTime();
        p5.calcular();
        long t5 = (new Date()).getTime();
        int n = p1.cuantos() + p2.cuantos() + p3.cuantos() + p4.cuantos() + p5.cuantos();
        long tf = (new Date()).getTime(); //t1=instante de final de los cálculos
        System.out.println("Tramo 1, calculado en " + (t1-t0));
        System.out.println("Tramo 2, calculado en " + (t2-t1));
        System.out.println("Tramo 3, calculado en " + (t3-t2));
        System.out.println("Tramo 4, calculado en " + (t4-t3));
        System.out.println("Tramo 5, calculado en " + (t5-t4));
        System.out.println("Número de primos menores que 10.000.000: " + n + " calculado en " + (tf-ti) + " miliseg. ");

    }

}
