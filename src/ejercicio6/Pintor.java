package ejercicio6;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Pintor extends Thread {

    JButton b;
    Color paleta[] = new Color[4];
    Color negro = Color.BLACK;
    public Pintor (JButton b) {
        this.b = b;
        paleta[0] = Color.RED;
        paleta[1] = Color.GREEN;
        paleta[2] = Color.BLUE;
        paleta[3] = Color.YELLOW;

    }
    public void run() {
         while (true) {
             b.setBackground(negro);
             Random rand = new Random();
             int await = rand.nextInt(4000 - 2000 + 1) + 2000;
             try
             {
                 Thread.sleep(await);
             }
             catch(InterruptedException ex)
             {
                 Thread.currentThread().interrupt();
             }
             int i = (int) (4. * Math.random());
             int await2 = rand.nextInt(5000 - 3000 + 1) + 3000;
             b.setBackground(paleta[i]);
             try
             {
                 Thread.sleep(await2);
             }
             catch(InterruptedException ex)
             {
                 Thread.currentThread().interrupt();
             }
         }
    }
}
