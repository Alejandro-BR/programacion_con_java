/**
 * Ejercicio 3: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T05Ejercicio03 {
  public static void main(String[] args) {
    int i = 1;
    int multiplos = 0;
    do {
      multiplos = i % 5;
      if (multiplos == 0) {
        System.out.println("Es multiplo de 5 el numero " + i);
        System.out.println(""); //SALTO DE LINEA 
      }
      i++;
    } while (i <= 100);
  }
}
