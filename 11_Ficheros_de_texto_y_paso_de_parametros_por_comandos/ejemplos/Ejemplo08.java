/**
 * Ejemplos08:
 * 
 * Paso de argumentos en la línea de comandos
 * 
 * Ejecutar en terminal:
 * 
 * java Ejemplo08 10 36 44
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejemplo08 {
  public static void main(String[] args) {

    int suma = 0;

    for (int i = 0; i < args.length; i++) {
      suma += Integer.parseInt(args[i]);
    }
    System.out.println(suma);
  }
}
