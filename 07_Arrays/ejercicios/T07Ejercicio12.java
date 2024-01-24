/**
 * Ejercicio 12: Realiza un programa que pida 10 números por teclado y que los
 * almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al
 * índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos
 * números están entre 0 y 9. El programa deberá colocar el número de la
 * posición
 * inicial en la posición final, rotando el resto de números para que no se
 * pierda
 * ninguno. Al final se debe mostrar el array resultante.
 * Por ejemplo, para inicial = 3 y final = 7:
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio12 {
  public static void main(String[] args) {
    int[] original = new int[10];
    int[] copia = new int[10];

    System.out.println("Introduce los 10 numeros: ");
    for (int i = 0; i < original.length; i++) {
      original[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("Arrya original: ");
    System.out.println("Indice");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", original[i]);
    }
    System.out.println();

    int nInicial;
    int nFinal;
    boolean continuar;

    do {
      continuar = true;

      System.out.println("Introduce un numero inicial: ");
      nInicial = Integer.parseInt(System.console().readLine());

      System.out.println("Introduce un numero final: ");
      nFinal = Integer.parseInt(System.console().readLine());

      if (nFinal <= nInicial) {
        System.out.println("Incorrecto. El numero inicial debe ser inferior o igual");
        continuar = false;
      }

      if ((nFinal < 0) || (nFinal > 9) || (nInicial < 0) || (nInicial > 9)) {
        System.out.println("ERROR. Debes introducir un numero (0-9)");
        continuar = false;
      }

    } while (!continuar);  //continuar == false

    //Copio el array
    for (int i = 0; i < copia.length; i++) {
      copia[i] = original[i];
    }

    copia[nFinal] = original[nInicial];

    //Copiamos valores desde la posicion siguiente de nFinal
    for (int i = nFinal + 1; i < copia.length; i++) {
      copia[nFinal] = original[i - 1];
    }

    copia[0] = original[original.length - 1];

    //Copiamos valores desde la primera posicion (original 1º --> copia 2º) del orignial hasta nInicial
    for (int i = 0; i < nInicial; i++) {
      copia[i+1] = original[i];
    }

    //Pintamos
    System.out.println("Arrya original: ");
    System.out.println("Indice");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", original[i]);
    }

    System.out.println();

    System.out.println("Arrya final: ");
    System.out.println("Indice");
    for (int i = 0; i < copia.length; i++) {
      System.out.printf("%4d", copia[i]);
    }

  }
}
