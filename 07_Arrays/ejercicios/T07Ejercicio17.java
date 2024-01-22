/**
 * Ejercicio 17: Escribe un programa que muestre por pantalla un array de 10
 * números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
 * uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio17 {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    boolean acierto = false;
    int numeroIntroducido;

    // Acignamos a la arrays los valores
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 101);
    }

    System.out.println();
    System.out.println("Introduce numeros entre el 0-100 hasta que adivines alguno de los 10 numeros excogidos");
    System.out.println();

    // Introducir los numeros por teclado
    do {
      System.out.print("\nIntroduce un numero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      for (int i = 0; i < numeros.length; i++) {
        if (numeroIntroducido == numeros[i]) {
          acierto = true;
        }
      }
    } while (acierto == false);

    //Rotamos la array hacia la derecha
    int aux;
    while (numeros[0] != numeroIntroducido) {
      aux = numeros[9];
      for (int i = 9; i > 0; i--) {
        numeros[i] = numeros[i -1];
      }
      numeros[0] = aux;
    }

    // Mostramos la array
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%-5d", numeros[i]);
    }

    System.out.println();
  }
}
