package ejercicio7;

public class Main {
    public static void main (String args[]) {
        Bicho padre = new Bicho(1,"ADAN");
        System.out.println("NACE: " + padre.getNombre() + ", de la generación " + padre.getGeneracion());
        padre.TiempoVida();
        padre.reproducirse(padre.getGeneracion());
    }
}
