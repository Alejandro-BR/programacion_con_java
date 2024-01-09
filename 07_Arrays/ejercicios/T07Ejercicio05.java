/**
 * Ejercicio 5: Escribe un programa que pida 10 números por teclado y que luego
 * muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio05 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    System.out.println(); // SALTO DE LINEA
    System.out.println("Introduzca numeros enteros y pulse INTRO: ");

    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }

    for (int i = 0; i < numero.length; i++) {
      System.out.println(numero[i]);
      if (numero[i] == maximo) {
        System.out.print(" maximo");
      }
      if (numero[i] == minimo) {
        System.out.print(" minimo");
      }
      System.out.println(""); //SALTO DE LINEA 
    }

  }
}
