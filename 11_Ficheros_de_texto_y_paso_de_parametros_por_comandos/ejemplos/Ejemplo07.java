/**
 * Ejemplo07:
 * 
 * Paso de argumentos en la línea de comandos.
 * 
 * Ejecutar en terminal:
 * 
 * java Ejemplo07 hola esto es un ejemplo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejemplo07 {
  public static void main(String[] args) {

    System.out.println("Los argumentos introducidos son: ");
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
