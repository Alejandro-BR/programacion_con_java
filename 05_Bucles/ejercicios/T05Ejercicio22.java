/**
 * Ejercicio 22: Muestra por pantalla todos los numeros primos entre 2 y 100, ambos incluidos.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T05Ejercicio22 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    for (int i = 2; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    System.out.println(""); //SALTO DE LINEA 
  }
}