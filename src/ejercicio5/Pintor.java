package ejercicio5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Pintor extends Thread {

    JButton b;
    Color colorin;
    public Pintor (JButton b) {
        this.b = b;
    }

    public void run() {
         while (true) {
             int i = (int) (5. * Math.random());
             b.setBackground(randomColor());
         }
    }

    public Color randomColor() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        Color aleatorio = new Color (r,g,b);

        return aleatorio;

    }
}
