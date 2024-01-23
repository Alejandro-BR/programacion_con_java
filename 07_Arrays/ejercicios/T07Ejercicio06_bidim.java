/**
 * Ejercicio 6 bidim: Que no se repitan numeros en el ejercicio anterior.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio06_bidim {
  public static void main(String[] args) {
    int numeros[][] = new int[6][10];
    int fila;
    int columna;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    boolean noRepetir = true;
    int aux = 0;

    // Rellanar el array y ver cual es el mayor y menor ademas de dibujar la tabla
    for (fila = 0; fila < numeros.length; fila++) {
      for (columna = 0; columna < numeros[fila].length; columna++) {

        do {
          aux = (int) (Math.random() * 1001);
          for (int i = 0; i < fila; i++) {
            for (int j = 0; j < numeros.length; j++) {
              if (aux == numeros[fila][columna]) {
                noRepetir = false;
              }
            }
          }
        } while (noRepetir == false);

        numeros[fila][columna] = aux;
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
