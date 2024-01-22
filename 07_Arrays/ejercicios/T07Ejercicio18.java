/**
 * Ejercicio 18: Realiza un programa que genere 10 números enteros aleatorios
 * entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente
 * el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 * 
 * Ejemplo 1:
 * Array original:
 * ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
 * │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
 * ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
 * │ Valor │ 127 │ 178 │ 11 │ 39 │ 121 │ 82 │ 130 │ 47 │ 128 │ 129 │
 * └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
 * Array resultado:
 * ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
 * │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
 * ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
 * │ Valor │ 11 │ 127 │ 39 │ 178 │ 82 │ 121 │ 47 │ 130 │ 128 │ 129 │
 * └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
 * Ejemplo 2:
 * Array original:
 * ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
 * │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
 * ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
 * │ Valor │ 170 │ 189 │ 87 │ 149 │ 176 │ 110 │ 119 │ 9 │ 33 │ 157 │
 * └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
 * Array resultado:
 * ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
 * │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
 * ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
 * │ Valor │ 87 │ 170 │ 9 │ 189 │ 33 │ 149 │ 176 │ 110 │ 119 │ 157 │
 * └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
 * Ejemplo 3:
 * Array original:
 * ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
 * │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
 * ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
 * │ Valor │ 119 │ 88 │ 139 │ 146 │ 34 │ 4 │ 195 │ 160 │ 27 │ 115 │
 * └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
 * Array resultado:
 * ┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
 * │ Índice │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │
 * ├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
 * │ Valor │ 88 │ 119 │ 34 │ 139 │ 4 │ 146 │ 27 │ 195 │ 160 │ 115 │
 * └────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio18 {
  public static void main(String[] args) {
    int[] numeros = new int[10];
    int[] nFinal = new int[10];

    // Asignamos 10 numeros aleatorios entre 0 y 200 a la array
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 201);
    }

    // Pintamo la array original
    System.out.println();
    System.out.println("Array original:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.println("│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  │");
    for (int i = 0; i < numeros.length; i++) {
      System.out.printf(" %-3d │", numeros[i]);
    }
    System.out.println("\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    // Ordenamos la nueva array
    int indiceF = 0;
    int contador = 0;
    for (int i = 0; i < numeros.length; i++) {
      if (contador % 2 == 0) {
        if (numeros[i] < 100) {
          nFinal[indiceF] = numeros[i];
          indiceF++;
        }
        contador++;
      } else if (contador % 2 != 0) {
        if (numeros[i] > 100) {
          nFinal[indiceF] = numeros[i];
          indiceF++;
        }
        contador++;
      }
    }

    // Pintamos la array final
    System.out.println();
    System.out.println("Array original:");
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.println("│ Índice │  0  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │");
    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  │");
    for (int i = 0; i < indiceF; i++) {
      System.out.printf(" %-3d │", nFinal[i]);
    }
    System.out.println("\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
  }
}


//Codigo resuleto del libro
// public class S71Ejercicio18 {

// public static void main(String[] args) {
// int[] a = new int[10];
// int[] menores = new int[10];
// int[] mayores = new int[10];
// int cuentaMenores = 0;
// int cuentaMayores = 0;

// // Genera el array original y clasifica los números
// for (int i = 0; i < 10; i++) {
// a[i] = (int) (Math.random() * 201);

// if (a[i] <= 100) {
// menores[cuentaMenores++] = a[i];
// } else {
// mayores[cuentaMayores++] = a[i];
// }
// }

// // Muestra el array original
// System.out.println("\nArray original:");
// System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
// System.out.print("│ Índice ");
// for (int i = 0; i < 10; i++) {
// System.out.printf("│%4d ", i);
// }
// System.out.println("│");
// System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
// System.out.print("│ Valor ");
// for (int i = 0; i < 10; i++) {
// System.out.printf("│%4d ", a[i]);
// }
// System.out.println("│");
// System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

// // Genera el array resultado
// int[] resultado = new int[10];
// int menoresColocados = 0;
// int mayoresColocados = 0;

// int j = 0;
// do {

// if (menoresColocados < cuentaMenores) {
// resultado[j++] = menores[menoresColocados++];
// }

// if (mayoresColocados < cuentaMayores) {
// resultado[j++] = mayores[mayoresColocados++];
// }

// } while (j < 10);

// // Muestra el resultado.
// System.out.println("\nArray resultado:");
// System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
// System.out.print("│ Índice ");
// for (int i = 0; i < 10; i++) {
// System.out.printf("│%4d ", i);
// }
// System.out.println("│");
// System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
// System.out.print("│ Valor ");
// for (int i = 0; i < 10; i++) {
// System.out.printf("│%4d ", resultado[i]);
// }
// System.out.println("│");
// System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
// }

// }