/**
 * Ejercicio 14: Escribe un programa que pida 8 palabras y las almacene en un
 * array. A continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa,negro, blanco y morado.
 * 
 * Ejemplo:
 * 
 * Array original:
 * ┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
 * │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │
 * ├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
 * │ casa │ azul │ verde │ orden │morado │bombilla│ bici │ rosa │
 * └────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
 * Array resultado:
 * ┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐
 * │ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │
 * ├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤
 * │ azul │ verde │ morado │ rosa │ casa │ orden │bombilla│ bici │
 * └────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio14 {
  public static void main(String[] args) {
    String palabras[] = new String[8];
    String colores[] = new String[8];
    int indiceColores = 0;

    System.out.println();
    for (int i = 0; i < palabras.length; i++) {
      System.out.println("Introduce una palabra: ");
      palabras[i] = System.console().readLine();
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
      }
    }

    System.out.println();
    System.out.println("Array original:");
    System.out.println();

    for (int i = 0; i < palabras.length; i++) {
      System.out.printf("| %-8d |",i); 
    } 

    System.out.println();

    for (int i = 0; i < palabras.length; i++) {
      System.out.printf("| %-8s |",palabras[i]); 
    }
  }
}
