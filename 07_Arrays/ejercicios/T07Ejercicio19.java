/**
 * Ejercicio 19: Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 * 
 * Ejemplo 2:
 * 
  Array original:

  Índice 0 1 2 3 4 5 6 7 8 9 10 11
  Valor 148 86 64 126 77 148 182 99 8 126 73 20

  Introduzca el número que quiere insertar: 33
  Introduzca la posición donde lo quiere insertar (0 – 11): 11

  Array resultado:

  Índice 0 1 2 3 4 5 6 7 8 9 10 11
  Valor 148 86 64 126 77 148 182 99 8 126 73 33

 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio19 {
  public static void main(String[] args) {
    int[] num = new int[12];
    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random()*201);
    }

    System.out.println();
    System.out.println("Array Original: ");
    System.out.print("Índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }

    System.out.print("\nIntroduzca el numero que quiere insertar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
    int posicion =  Integer.parseInt(System.console().readLine());

    //Desplazar los valores e insertar el numero
    for (int i = num.length - 1; i < posicion; i--) {
      num[i] = num[i - 1];
    }

    num[posicion] = numeroIntroducido;

    System.out.println(); //SALTO DE LINEA 
    System.out.println();
    System.out.println("Array modificado: ");
    System.out.print("Índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }
    System.out.println(); //SALTO DE LINEA 
  }
}
