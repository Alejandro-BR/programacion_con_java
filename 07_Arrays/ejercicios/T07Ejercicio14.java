/**
 * Ejercicio 14: Escribe un programa que pida 8 palabras y las almacene en un
 * array. A continuación, las palabras correspondientes a colores se deben
 * almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos
 * arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja,
 * rosa,negro, blanco y morado.
 * 
 * Ejemplo:
 * 
 * Array original:
 * ┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
 * │      0 │      1 │      2 │      3 │      4 │      5 │      6 │      7 │
 * ├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
 * │   casa │   azul │  verde │  orden │ morado │bombilla│   bici │   rosa │
 * └────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
 * Array resultado:
 * ┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
 * │      0 │      1 │      2 │      3 │      4 │      5 │      6 │      7 │
 * ├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
 * │   azul │  verde │ morado │   rosa │   casa │  orden │bombilla│   bici │
 * └────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio14 {
  public static void main(String[] args) {
    String palabras[] = new String[8];
    String colores[] = new String[8];
    int indiceColores = 0;
    int maximosDigitos = 0;

    System.out.println();
    for (int i = 0; i < palabras.length; i++) {
      System.out.println("Introduce una palabra: ");
      palabras[i] = System.console().readLine();
      // Saber cual es la palabra mas grande
      if (palabras[i].length() > maximosDigitos) {
        maximosDigitos = palabras[i].length();
      }
      // Añadir los colores
      switch (palabras[i]) {
        case "rojo":
        case "verde":
        case "azul":
        case "amarillo":
        case "naranja":
        case "rosa":
        case "negro":
        case "blanco":
        case "morado":
          colores[indiceColores] = palabras[i];
          indiceColores++;
          break;
        default:
          break;
      }
    }

    // Pintamos la array original **********************************************
    System.out.println();
    System.out.println("Array original:");
    System.out.println();

    // Primera linea de la tabla

    for (int i = 0; i < palabras.length; i++) {
      if (i == 0) {
        System.out.print("┌");
      }

      // Centro
      for (int j = 0; j < maximosDigitos + 2; j++) {
        System.out.print("─");
      }

      if (i == (palabras.length - 1)) {
        System.out.println("┐");
      } else {
        System.out.print("┬");
      }
    }

    // Indice de la tabla

    for (int i = 0; i < palabras.length; i++) {
      System.out.print("│ " + i);
      for (int j = 0; j < maximosDigitos; j++) {
        System.out.print(" ");
      }
    }
    System.out.println("│");

    // Segunda linea de la tabla

    for (int i = 0; i < palabras.length; i++) {
      if (i == 0) {
        System.out.print("├");
      }

      // Centro
      for (int j = 0; j < maximosDigitos + 2; j++) {
        System.out.print("─");
      }

      if (i == (palabras.length - 1)) {
        System.out.println("┤");
      } else {
        System.out.print("┼");
      }
    }

    // Palabras de la tabla

    for (int i = 0; i < palabras.length; i++) {
      System.out.print("│ " + palabras[i]);
      for (int j = 0; j <= (maximosDigitos - palabras[i].length()); j++) {
        System.out.print(" ");
      }
    }
    System.out.println("│");

    // Ultima linea de la tabla

    for (int i = 0; i < palabras.length; i++) {
      if (i == 0) {
        System.out.print("└");
      }

      // Centro
      for (int j = 0; j < maximosDigitos + 2; j++) {
        System.out.print("─");
      }

      if (i == (palabras.length - 1)) {
        System.out.println("┘");
      } else {
        System.out.print("┴");
      }
    }

    System.out.println();

    // Pintamos la array final **********************************************
    System.out.println();
    System.out.println("Array final:");
    System.out.println();

    // Primera linea de la tabla

    for (int i = 0; i < colores.length; i++) {
      if (i == 0) {
        System.out.print("┌");
      }

      // Centro
      for (int j = 0; j < maximosDigitos + 2; j++) {
        System.out.print("─");
      }

      if (i == (palabras.length - 1)) {
        System.out.println("┐");
      } else {
        System.out.print("┬");
      }
    }

    // Indice de la tabla

    for (int i = 0; i < colores.length; i++) {
      System.out.print("│ " + i);
      for (int j = 0; j < maximosDigitos; j++) {
        System.out.print(" ");
      }
    }
    System.out.println("│");

    // Segunda linea de la tabla

    for (int i = 0; i < colores.length; i++) {
      if (i == 0) {
        System.out.print("├");
      }

      // Centro
      for (int j = 0; j < maximosDigitos + 2; j++) {
        System.out.print("─");
      }

      if (i == (colores.length - 1)) {
        System.out.println("┤");
      } else {
        System.out.print("┼");
      }
    }

    // Palabras de la tabla

    // Primero los colores
    for (int i = 0; i < indiceColores; i++) {
      System.out.print("│ " + colores[i]);
      for (int j = 0; j <= (maximosDigitos - colores[i].length()); j++) {
        System.out.print(" ");
      }
    }

    // Las palabras menos los colores
    for (int i = 0; i < palabras.length; i++) {
      switch (palabras[i]) {
        case "rojo":
        case "verde":
        case "azul":
        case "amarillo":
        case "naranja":
        case "rosa":
        case "negro":
        case "blanco":
        case "morado":
          break;
        default:
          System.out.print("│ " + palabras[i]);
          for (int j = 0; j <= (maximosDigitos - palabras[i].length()); j++) {
            System.out.print(" ");
          }
          break;
      }
    }

    System.out.println("│");

    // Ultima linea de la tabla

    for (int i = 0; i < colores.length; i++) {
      if (i == 0) {
        System.out.print("└");
      }

      // Centro
      for (int j = 0; j < maximosDigitos + 2; j++) {
        System.out.print("─");
      }

      if (i == (colores.length - 1)) {
        System.out.println("┘");
      } else {
        System.out.print("┴");
      }
    }

    System.out.println();

  }
}
