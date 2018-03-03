package ejercicio7;

import java.util.*;

public class Bicho extends Thread {

    private int generacion;
    private String nombre;

    public Bicho (int generacion, String nombre){
        this.generacion = generacion;
        this.nombre = nombre;

    }

    public int getGeneracion() {
        return this.generacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void TiempoVida () {
        Random rand = new Random();
        int await = rand.nextInt(1000 - 500 + 1) + 500;
        System.out.printf("El tiempo de vida ha sido de " + (await/1000f) + " segundos. \n");
        try
        {
            Thread.sleep(await);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void reproducirse (int generacion) {
        while (generacion < 5) {
            Bicho hijo = new Bicho(generacion + 1, getSaltString());
            System.out.println("NACE: " + hijo.getNombre() + ", de la generación " + hijo.getGeneracion());
            hijo.TiempoVida();
            hijo.reproducirse(hijo.getGeneracion());
        }
        try {
            System.out.println("Ya no es posible continuar la reproducción");
            Thread.currentThread().join();
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 4) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
