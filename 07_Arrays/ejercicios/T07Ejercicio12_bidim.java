/**
 * Ejercicio 12 bidim: Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio12_bidim {
  public static void main(String[] args) {
    int[][] numeros = new int[9][9];
    int maximo = 500;
    int minimo = 900;
    int suma = 0;
    
    //Rellenear y mostrar la array completa
    System.out.println();
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros.length; j++) {
        numeros[i][j] = (int)((Math.random()*401) + 500);
        System.out.printf("%4d", numeros[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    //Mostrar los numeros de la diagonal empezando por la esquina inferior izquierda
    //hasta la esquina superior derechar

    for (int i = 0; i < 9; i++) {
      System.out.printf("%4d", numeros[8 - i][i]);
      if (numeros[8 - i][i] > maximo) {
        maximo = numeros[8 - i][i];
      }
      if (numeros[8 - i][i] < minimo) {
        minimo = numeros[8 - i][i];
      }
      suma += numeros[8 - i][i];
    }

    System.out.println("\nMáximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + ((double) suma / 10));
    System.out.println();
  }
}
