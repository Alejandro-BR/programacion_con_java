/**
 * Ejercicio 5: Realiza un programa que rellene un array de 6 filas por 10
 * columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio5bidim {
  public static void main(String[] args) {
    int numeros[][] = new int[6][10];
    int fila;
    int columna;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    // Rellanar el array y ver cual es el mayor y menor ademas de dibujar la tabla
    for (fila = 0; fila < numeros.length; fila++) {
      for (columna = 0; columna < numeros[fila].length; columna++) {
        numeros[fila][columna] = (int) (Math.random() * 1001);
        System.out.printf("%-8d", numeros[fila][columna]);
        if (numeros[fila][columna] > maximo) {
          maximo = numeros[fila][columna];
        }
        if (numeros[fila][columna] < minimo) {
          minimo = numeros[fila][columna];
        }
      }
      System.out.println(); // SALTO DE LINEA
    }

    System.out.println(""); // SALTO DE LINEA

    System.out.println(); // SALTO DE LINEA

    // Dibujar el maximo y minimo
    for (fila = 0; fila < numeros.length; fila++) {
      for (columna = 0; columna < numeros[fila].length; columna++) {
        if (numeros[fila][columna] == maximo) {
          System.out.println("El numero maximo es " + numeros[fila][columna] + " y su fila es " + fila
              + " y su columna " + columna);
        }
        if (numeros[fila][columna] == minimo) {
          System.out.println("El numero minimo es " + numeros[fila][columna] + " y su fila es " + fila
              + " y su columna " + columna);
        }
      }
    }

    System.out.println(""); // SALTO DE LINEA
  }
}
