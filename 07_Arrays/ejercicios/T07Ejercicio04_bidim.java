/**
 * Ejercicio 4: Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio04_bidim {
  public static void main(String[] args) throws InterruptedException {
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
        Thread.sleep(200);
      }
      Thread.sleep(1000);
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
      Thread.sleep(1000);
    }

    System.out.printf("|%8d\n",sumaTotal); 
    System.out.println();
  }
}
