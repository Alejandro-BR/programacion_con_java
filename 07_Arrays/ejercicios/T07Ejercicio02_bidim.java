/**
 * Ejercicio 2 bidimensionales: Escribe un programa que pida 20 números enteros.
 * Estos números se deben introducir en un array de 4 filas por 5 columnas.
 * El programa mostrará las sumas parciales de filas y columnas igual que si de
 * una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio02_bidim {
  public static void main(String[] args) {
    int[][] numeros = new int[4][5];
    int suma = 0;
    int total = 0;

    // Pedimos los 20 numeros
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        System.out.print("Introduce un numero: ");
        numeros[i][j] = Integer.parseInt(System.console().readLine());
      }
    }

    System.out.println();

    //Creamos la tabla
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        System.out.printf("%-5d",numeros[i][j]);
        suma += numeros[i][j];
      }
      System.out.println("| " + suma);
      suma = 0;
    }
    System.out.println("-------------------------------");

    for (int j = 0; j < numeros[0].length; j++) {
      for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i][j];
      }
      System.out.printf("%-5d",suma);
      total += suma;
      suma = 0;
    }

    System.out.printf("| %2d",total);
    System.out.println();

  }
}
