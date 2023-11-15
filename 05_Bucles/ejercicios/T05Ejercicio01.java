/**
 * Ejercicio 1: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T05Ejercicio01 {
  public static void main(String[] args) {
    int multiplos = 0;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Numeros multiplos de 5:");
    System.out.println(""); //SALTO DE LINEA 

    for (int i = 0; i <= 100; i++){
      // System.out.println(i);
      multiplos = i % 5;
      if (multiplos == 0) {
        System.out.println("Es multiplo de 5 el numero " + i);
        System.out.println(""); //SALTO DE LINEA 
      }

      //Podria en vez de uno en uno pasar de 5 en 5 y ahorrarme todo lo demas 
    }

  }
}
