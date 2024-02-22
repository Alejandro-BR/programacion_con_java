/**
 * Ejercicio 5: Realiza de nuevo el ejercicio de la colección de discos pero utilizando 
 * esta vez una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio05;

import java.util.ArrayList;

public class Coleccion {

  /**
   * Mostrar la coleccion
   * 
   * @param coleccion
   */
  private static void mostrarColeccion(ArrayList<Disco> coleccion) {
    System.out.println("Coleccion: \n");
    for (int i = 0; i < coleccion.size(); i++) {
      System.out.println(coleccion.get(i).toString() + " \n");
    }
  }

  /**
   * Crear un nuevo disco
   * 
   * @param coleccion
   */
  private static void nuevoDisco(ArrayList<Disco> coleccion) {
    int indice = 0;
    boolean vacio = false;
    String respuesta1;
    int respuesta2;

    for (int i = 0; i < coleccion.size(); i++) {
      if (coleccion.get(i).getCodigo().equals("LIBRE")) {
        indice = i;
        vacio = true;
        break;
      }
    }

    if (vacio) {
      System.out.print("Introduce el nombre: ");
      respuesta1 = System.console().readLine();
      coleccion.get(indice).setNombre(respuesta1);
      System.out.print("Introduce el album: ");
      respuesta1 = System.console().readLine();
      coleccion.get(indice).setAlbum(respuesta1);
      System.out.print("Introduce el artista: ");
      respuesta1 = System.console().readLine();
      coleccion.get(indice).setArtista(respuesta1);
      boolean unico = true;
      do {
        System.out.print("Introduce el codigo: ");
        respuesta1 = System.console().readLine();
        for (int i = 0; i < coleccion.size(); i++) {
          if (coleccion.get(i).getCodigo().equals(respuesta1)) {
            unico = false;
            System.out.println("\nEl codigo ya existe.\n");
            break;
          }
        }
      } while (!unico);
      coleccion.get(indice).setCodigo(respuesta1);
      System.out.print("Introduce las horas de duracion: ");
      respuesta2 = Integer.parseInt(System.console().readLine());
      coleccion.get(indice).setHorasDuracion(respuesta2);
      System.out.println("\nNuevo disco creado!\n");
    } else {
      System.out.println("No hay ningun hueco libre en tu coleccion.");
      System.out.println("Se necesita borrar algun disco para poder añadir uno nuevo.\n");
    }
  }

  /**
   * Mostrar disco
   * 
   * @param coleccion 
   */
  private static void mostrarDisco(ArrayList<Disco> coleccion) {
    System.out.print("Introduce el indice del disco dentro de la coleccion: ");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.println("\n" + coleccion.get(indice) + "\n");
  }

  /**
   * Borrar el disco
   * 
   * @param coleccion
   */
  private static void borrarDisco(ArrayList<Disco> coleccion) {
    int indice = 0;
    boolean libre = false;
    System.out.print("Introduce el codigo del disco: ");
    String codigo = System.console().readLine();
    
    for (int i = 0; i < coleccion.size(); i++) {
      if (coleccion.get(i).getCodigo().equals(codigo)) {
        indice = i;
        libre = true;
        break;
      }
    }

    if (!libre) {
      System.out.println("\nEste codigo no existe.\n");
    } else {
      coleccion.get(indice).borrar();
      System.out.println("\nDisco eliminado.\n");
    }
  }

  /**
   * Intercambiar dos discos
   * 
   * Se muestra la coleccion antes y despues
   * 
   * @param coleccion
   */
  private static void intercambiar(ArrayList<Disco> coleccion) {
    int disco1;
    int disco2;

    mostrarColeccion(coleccion);

    System.out.print("Introduce el indice del primer disco: ");
    disco1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el indice del segundo disco: ");
    disco2 = Integer.parseInt(System.console().readLine());
    System.out.println();

    Disco aux = coleccion.get(disco1);
    coleccion.set(disco1, coleccion.get(disco2));
    coleccion.set(disco2, aux);

    mostrarColeccion(coleccion);
  }

  /**
   * Listado
   * 
   * @param coleccion
   */
  private static void listado(ArrayList<Disco> coleccion) {
    int menu = 0;
    boolean noSeEncontro = true;
    do {
      System.out.println("Menu del listado:");
      System.out.println("1. Nombre.");
      System.out.println("2. Artista.");
      System.out.println("3. Horas de duracion.");
      System.out.print("Introduce la opcion: ");
      menu = Integer.parseInt(System.console().readLine());
    } while (menu < 1 || menu > 3);

    switch (menu) {
      case 1:
        System.out.print("Introduce el nombre: ");
        String nombre = System.console().readLine(); 
        for (int i = 0; i < coleccion.size(); i++) {
          if (nombre == coleccion.get(i).getNombre()) {
            System.out.println(coleccion.get(i).toString());
            noSeEncontro = false;
          }
        }
        break;
      case 2:
      System.out.print("Introduce el artista: ");
      String artista = System.console().readLine(); 
      for (int i = 0; i < coleccion.size(); i++) {
        if (artista == coleccion.get(i).getArtista()) {
          System.out.println(coleccion.get(i).toString());
          noSeEncontro = false;
        }
      }
        break;
      case 3:
      System.out.print("Introduce la duracion: ");
      int duracion = Integer.parseInt(System.console().readLine()); 
      for (int i = 0; i < coleccion.size(); i++) {
        if (duracion == coleccion.get(i).getHorasDuracion()) {
          System.out.println(coleccion.get(i).toString());
          noSeEncontro = false;
        }
      }
        break;
      default:
        break;
    }

    if (noSeEncontro) {
      System.out.println("\nNo se encontro.\n");
    }
  }

  public static void main(String[] args) {
    boolean salir = false;
    int menu = 0;
    // Creacion de la biblioteca
    ArrayList<Disco> coleccion = new ArrayList<>();

    for (int i = 0; i < 10; i++) { 
      Disco disco = new Disco();
      coleccion.add(disco);
    }

    System.out.println("\nColección de discos\n");

    do {
      // Menu
      System.out.println("1. Mostrar coleccion.");
      System.out.println("2. Mostrar disco.");
      System.out.println("3. Borrar disco.");
      System.out.println("4. Nuevo disco");
      System.out.println("5. Intercambiar dos discos.");
      System.out.println("6. Listado.");
      System.out.println("7. Salir.");

      do {
        System.out.print("\nElige la opcion: ");
        menu = Integer.parseInt(System.console().readLine());
        System.out.println();
      } while (menu > 6 || menu < 1);

      // Llamar funciones
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
        case 6:
          listado(coleccion);
          break;
        default:
          salir = true;
          break;
      }

    } while (!salir);

    System.out.println("Salir\n");
  }
}
