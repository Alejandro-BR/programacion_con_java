/**
 * Ejercicio 3: Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 * 
 * Aplicacion para organizar tu bibiloteca de discos
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_03_arrays;

public class Coleccion {

  /**
   * Mostrar la coleccion
   * 
   * @param coleccion
   */
  private static void mostrarColeccion(Disco[] coleccion) {
    System.out.println("Coleccion: \n");
    for (int i = 0; i < coleccion.length; i++) {
      System.out.println(coleccion[i].toString() + " \n");
    }
  }

  /**
   * Crear un nuevo disco
   * 
   * @param coleccion
   */
  private static void nuevoDisco(Disco[] coleccion) {
    int indice = 0;
    boolean vacio = false;
    String respuesta1;
    int respuesta2;

    for (int i = 0; i < coleccion.length; i++) {
      if (coleccion[i].getCodigo() == "LIBRE") {
        indice = i;
        vacio = true;
        break;
      }
    }

    if (vacio) {
      System.out.print("Introduce el nombre: ");
      respuesta1 = System.console().readLine();
      coleccion[indice].setNombre(respuesta1);
      System.out.print("Introduce el album: ");
      respuesta1 = System.console().readLine();
      coleccion[indice].setAlbum(respuesta1);
      System.out.print("Introduce el artista: ");
      respuesta1 = System.console().readLine();
      coleccion[indice].setArtista(respuesta1);
      System.out.print("Introduce el codigo: ");
      respuesta1 = System.console().readLine();
      coleccion[indice].setCodigo(respuesta1);
      System.out.print("Introduce las horas de duracion: ");
      respuesta2 = Integer.parseInt(System.console().readLine());
      coleccion[indice].setHorasDuracion(respuesta2);
      System.out.println("\nNuevo disco creado!\n");
    } else {
      System.out.println("No hay ningun hueco libre en tu coleccion.\n");
    }
  }

  /**
   * Mostrar disco
   * 
   * @param coleccion
   */
  private static void mostrarDisco(Disco[] coleccion) {
    System.out.print("Introduce el indice del disco dentro de la coleccion: ");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.println("\n" + coleccion[indice] + "\n");
  }

  /**
   * Borrar el disco
   * 
   * @param coleccion
   */
  private static void borrarDisco(Disco[] coleccion) {
    System.out.print("Introduce el indice del disco dentro de la coleccion: ");
    int indice = Integer.parseInt(System.console().readLine());
    coleccion[indice].borrar();
    System.out.println("\nDisco eliminado \n");
    if (coleccion[indice].getCodigo() == "LIBRE") {
      System.out.println("Este disco ya estaba vacio anteriormente.\n");
    }
  }

  /**
   * Intercambiar dos discos
   * 
   * Se muestra la coleccion antes y despues
   * 
   * @param coleccion
   */
  private static void intercambiar(Disco[] coleccion) {
    int disco1;
    int disco2;

    mostrarColeccion(coleccion);

    System.out.print("Introduce el indice del primer disco: ");
    disco1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el indice del segundo disco: ");
    disco2 = Integer.parseInt(System.console().readLine());
    System.out.println();

    Disco aux = coleccion[disco1];
    coleccion[disco1] = coleccion[disco2];
    coleccion[disco2] = aux;

    mostrarColeccion(coleccion);
  }

  public static void main(String[] args) {
    boolean salir = false;
    int menu = 0;
    // Creacion de la biblioteca
    Disco[] coleccion = new Disco[10];

    for (int i = 0; i < coleccion.length; i++) {
      coleccion[i] = new Disco();
    }

    System.out.println("\nColección de discos\n");

    do {
      // Menu
      System.out.println("1. Mostrar coleccion.");
      System.out.println("2. Mostrar disco.");
      System.out.println("3. Borrar disco.");
      System.out.println("4. Nuevo disco");
      System.out.println("5. Intercambiar dos discos.");
      System.out.println("6. Salir.");

      do {
        System.out.print("\nElige la opcion: ");
        menu = Integer.parseInt(System.console().readLine());
        System.out.println();
      } while (menu > 6 || menu < 1);

      //Llamar funciones
      switch (menu) {
        case 1:
          mostrarColeccion(coleccion);
          break;
        case 2:
          mostrarDisco(coleccion);
          break;
        case 3:
          borrarDisco(coleccion);
          break;
        case 4:
          nuevoDisco(coleccion);
          break;
        case 5:
          intercambiar(coleccion);
          break;
        default:
          salir = true;
          break;
      }

    } while (!salir);

    System.out.println("Salir\n");
  }
}
