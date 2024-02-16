/**
 * Ejercicio 4: Modifica el programa “Colección de discos” como se indica a continuación:
 * 
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 * 
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 * introducido por el usuario existe.
 * 
 * c) Modifica el programa de tal forma que el código del disco sea único, es decir
 * que no se pueda repetir.
 * 
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 * listado completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género determinado) y un listado de discos cuya duración esté en un rango determinado
 * por el usuario.
 * 
 * Aplicacion para organizar tu bibiloteca de discos version mejorada.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_04_arrays;

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
      if (coleccion[i].getCodigo().equals("LIBRE")) {
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
      boolean unico = true;
      do {
        System.out.print("Introduce el codigo: ");
        respuesta1 = System.console().readLine();
        for (int i = 0; i < coleccion.length; i++) {
          if (coleccion[i].getCodigo().equals(respuesta1)) {
            unico = false;
            System.out.println("\nEl codigo ya existe.\n");
            break;
          }
        }
      } while (!unico);
      coleccion[indice].setCodigo(respuesta1);
      System.out.print("Introduce las horas de duracion: ");
      respuesta2 = Integer.parseInt(System.console().readLine());
      coleccion[indice].setHorasDuracion(respuesta2);
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
    int indice = 0;
    boolean libre = false;
    System.out.print("Introduce el codigo del disco: ");
    String codigo = System.console().readLine();
    
    for (int i = 0; i < coleccion.length; i++) {
      if (coleccion[i].getCodigo().equals(codigo)) {
        indice = i;
        libre = true;
        break;
      }
    }

    if (!libre) {
      System.out.println("\nEste codigo no existe.\n");
    } else {
      coleccion[indice].borrar();
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

  /**
   * Listado
   * 
   * @param coleccion
   */
  private static void listado(Disco[] coleccion) {
    boolean salir = false;
    int menu = 0;
    do {
      System.out.println("Menu del listado:");
      System.out.println("1. Nombre.");
      System.out.println("2. Artista.");
      System.out.println("3. Horas de duracion.");
      System.out.print("Introduce la opcion: ");
      menu = Integer.parseInt(System.console().readLine());
    } while (!salir);

    switch (menu) {
      case 1:
        System.out.print("Introduce el nombre: ");
        String nombre = System.console().readLine(); 
        for (int i = 0; i < coleccion.length; i++) {
          if (nombre == coleccion[i].getNombre()) {
            System.out.println(coleccion[i].toString());
          }
        }
        break;
      case 2:
      System.out.print("Introduce el artista: ");
      String artista = System.console().readLine(); 
      for (int i = 0; i < coleccion.length; i++) {
        if (artista == coleccion[i].getArtista()) {
          System.out.println(coleccion[i].toString());
        }
      }
        break;
      case 3:
      System.out.print("Introduce la duracion: ");
      int duracion = Integer.parseInt(System.console().readLine()); 
      for (int i = 0; i < coleccion.length; i++) {
        if (duracion == coleccion[i].getHorasDuracion()) {
          System.out.println(coleccion[i].toString());
        }
      }
        break;
      default:
        break;
    }
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
