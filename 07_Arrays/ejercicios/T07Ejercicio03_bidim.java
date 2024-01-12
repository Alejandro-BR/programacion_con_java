/**
 * Ejercicio 3: Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio03_bidim {
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    //Rellanar el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int) (Math.random() *900 + 100);
      }
    }

    //Mostramos el array
    int sumaFila;
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for ( columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumaFila += tabla[fila][columna];
      }
      System.out.printf("|%8d\n", sumaFila); //Muestro la suma de la fila y salto de linea
    }

    for (columna = 0; columna < tabla.length + 45; columna++) {
      System.out.print("-");
    }

    System.out.println();

    int sumaColumna;
    int sumaTotal = 0;
    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumna += tabla[fila][columna];
      }
      System.out.printf("%8d", sumaColumna);
      sumaTotal += sumaColumna;
    }

    System.out.printf("|%8d\n",sumaTotal); 
    System.out.println();
  }
}
