/**
 * Ejercicio 16: Crea las clases Punto y Linea. De un punto se tienen que saber sus coordenadas x e y, mientras que una línea está definida por dos puntos. Define las
 * clases y los métodos necesarios para que el siguiente código muestre la salida
 * que se indica
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_16;

public class AppLineas {
  public static void main(String[] args) {
    Punto p1 = new Punto(4.21, 7.3);
    Punto p2 = new Punto(-2, 1.66);
    Linea l = new Linea(p1, p2);
    System.out.println("\n" + l + "\n");
  }
}
