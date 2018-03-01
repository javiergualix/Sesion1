package ejercicio3;

public class Suma3y5 extends Thread {

    private long x,y,suma = 0;

    public Suma3y5 (int x, int y) {
        this.x = x;
        this.y = y;
    }

    private boolean esDivisible (int n) {
        boolean divisible = false;
        int i = 3;
        int j = 5;

        if (n%10 == i) {
            divisible = true;
        } else if (n%10 == j){
            divisible = true;
        }
        return divisible;
    }

    public void run() {
        for (long i = x; i<= y; i++) {
            if (esDivisible((int) i)) {
                suma += i;
            }
        }
    }

    public long suma() {
        return suma;
    }

}
