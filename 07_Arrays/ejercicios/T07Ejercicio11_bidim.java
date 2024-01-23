/**
 * Ejercicio 11 bidim: Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio11_bidim {
  public static void main(String[] args) {
    int[][] numeros  = new int[10][10];
    int minimo = 300;
    int maximo = 200;
    int suma = 0;

    //Asignamos los valores
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros.length; j++) {
        numeros[i][j] = (int)((Math.random()*101) + 200);
      }
    }

    //Mostramos la array
    System.out.println(); 
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros.length; j++) {
        System.out.printf("%-4d", numeros[i][j]);
      }
      System.out.println(); 
    }
    System.out.println(); 

    //Mostrar la dioganal
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i][i] + " ");
      //Numero mas pequeño de la dioganal se guarda en una variable
      if (minimo > numeros[i][i]) {
        minimo = numeros[i][i];
      }
      //Numero mas grande de la dioganal se guarda en una variable
      if (maximo < numeros[i][i]) {
        maximo = numeros[i][i];
      }
      suma += numeros[i][i]; //Suma para calcular la media
    }

    //Mostramos el maximo el minimo y la media
    System.out.println();
    System.out.println("El numero mas pequeño de la dioganal es " + minimo);
    System.out.println("El numero mas grande de la dioganal es " + maximo);
    System.out.println("La media de la diagonal es " + (suma/numeros.length));
    System.out.println();
  }
}
