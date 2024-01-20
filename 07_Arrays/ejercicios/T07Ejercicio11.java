/**
 * Ejercicio 11: Realiza un programa que pida 10 números por teclado y que los
 * almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 *
 * Se encuentra un ejemplo en el libro.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio11 {
  public static void main(String[] args) {
    int numeros[] = new int[10];
    int numeroFinales[] = new int[10];
    int num;
    int indiceF = 0;

    // Pedir y almacenar los 10 numeros
    System.out.println();
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Introduce un numero entero: ");
      num = Integer.parseInt(System.console().readLine());
      numeros[i] = num;
    }
    System.out.println();

    // Dibujar la array junto a su indice y averiguamos si es primo o no para
    // guardarlo en otra array
    System.out.println("Indice:  0   1   2   3   4   5   6   7   8   9");
    System.out.print("Valor:");
    for (int i = 0; i < numeros.length; i++) {
      num = numeros[i];
      System.out.printf("%4d", num);
      // Si num es 2 o 0 como no entrari en mi bucle se le asignaria a numeroFinales
      // desde aqui
      if ((num == 2) || (num == 0)) {
        numeroFinales[indiceF] = num;
        indiceF++;
        numeros[i] = 0;
      }
      // Bucle para asignar a numeroFinalesSSS
      for (int j = 2; j < num;) {
        if (num % j != 0) {
          break;
        } else {
          numeroFinales[indiceF] = num;
          indiceF++;
          numeros[i] = 0;
          break;
        }
      }
    }

    // Poner en la array final el resto de numeros
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] != 0) {
        numeroFinales[indiceF] = numeros[i];
        indiceF++;
      }
    }

    //Dibujar la array final
    System.out.println();
    System.out.println();
    System.out.println("Indice:  0   1   2   3   4   5   6   7   8   9");
    System.out.print("Valor:");
    num = 0;
    for (int i = 0; i < numeroFinales.length; i++) {
      num = numeroFinales[i];
      System.out.printf("%4d", num);
    }

    System.out.println();
  }
}
