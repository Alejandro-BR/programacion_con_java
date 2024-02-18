/**
 * Ejercicio 5: Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el código,
 * la descripción, el precio de compra, el precio de venta y el stock (número de
 * unidades). El menú del programa debe tener, al menos, las siguientes opciones:
 * 
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir
 * 
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no
 * se pueda sacar más mercancía de la que hay en el almacén.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_05_arrays;

public class GESTISIMAL {

  /**
   * Lista de articulos
   * 
   * @param articulos Articulo[]
   */
  private static void listado(Articulo[] articulos) {
    for (int i = 0; i < articulos.length; i++) {
      System.out.println(articulos[i]);
    }
  }

  /**
   * Dar de alta un articulo
   * 
   * @param articulos Articulo[]
   */
  private static void alta(Articulo[] articulos) {
    int vacio = -1;
    // Comprobar que alguno este vacio
    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i] == null) {
        vacio = i;
        break;
      }
    }

    if (vacio == -1) {
      System.out.println("No hay hueco libre, elimina algun articulo para añadir uno nuevo.\n");
    } else {
      // Declarar objeto
      System.out.print("Introduce el codigo: ");
      int codigo = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce la descripcion: ");
      String descripcion = System.console().readLine();
      System.out.print("Introduce el precio de compra: ");
      double precioCompra = Double.parseDouble(System.console().readLine());
      System.out.print("Introduce el precio de venta: ");
      double precioVenta = Double.parseDouble(System.console().readLine());
      System.out.print("Introduce el stock: ");
      int stock = Integer.parseInt(System.console().readLine());
      System.out.println();

      articulos[vacio] = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
    }
  }

  /**
   * Dar de baja un articulo
   * 
   * @param articulos Articulo[]
   */
  private static void baja(Articulo[] articulos) {
    System.out.print("Introduce el codigo del objeto que quieres eliminar: ");
    int codigo = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo() == codigo) {
        articulos[i] = null;
        break;
      }
    }

    System.out.println("\nArticulo eliminado.\n");
  }

  /**
   * Entra mas articulos de un cierto articulo
   * 
   * @param articulos Articulo[]
   */
  private static void entradaM(Articulo[] articulos) {
    System.out.print("Introduce el codigo del objeto que quieres aumentar: ");
    int codigo = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce cuantos articulos entran: ");
    int entra = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo() == codigo) {
        articulos[i].entrada(entra);
        break;
      }
    }

    System.out.println();
  }

  /**
   * Salen articulos de un cierto articulo
   * 
   * @param articulos Articulo[]
   */
  private static void salidaM(Articulo[] articulos) {
    System.out.print("Introduce el codigo del objeto que quieres desminuir: ");
    int codigo = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce cuantos articulos saldran: ");
    int sale = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < articulos.length; i++) {
      if (articulos[i].getCodigo() == codigo) {
        articulos[i].salida(sale);
        break;
      }
    }

    System.out.println();
  }

  /**
   * Modificacion de algun articulo
   * 
   * @param articulos Articulo[]
   */
  private static void modificacion(Articulo[] articulos) {

    System.out.print("\nIntroduce el indice de la lita: ");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.print("Que quieres cambiar: ");
    String menu = System.console().readLine();

    switch (menu) {
      case "codigo":
        System.out.print("Introduce el codigo: ");
        int codigo = Integer.parseInt(System.console().readLine());
        articulos[indice].setCodigo(codigo);
        break;
      case "descripcion":
        System.out.print("Introduce la descripcion: ");
        String descripcion = System.console().readLine();
        articulos[indice].setDescripcion(descripcion);
        break;
      case "precio compra":
        System.out.print("Introduce el precio de compra: ");
        double precioCompra = Double.parseDouble(System.console().readLine());
        articulos[indice].setPrecioCompra(precioCompra);
        break;
      case "precio venta":
        System.out.print("Introduce el precio de venta: ");
        double precioVenta = Double.parseDouble(System.console().readLine());
        articulos[indice].setPrecioVenta(precioVenta);
        break;
      case "stock":
        System.out.print("Introduce el stock: ");
        int stock = Integer.parseInt(System.console().readLine());
        articulos[indice].setStock(stock);
        break;
      default:
        System.out.println("\nNo introduciste un atributo correctamente.\n");
        break;
    }

    System.out.println();
  }

  public static void main(String[] args) {
    Articulo[] articulos = new Articulo[10]; // Declaracion del array
    boolean salir = false;
    int menu = 0;

    do {
      System.out.println("\nGESTISIMAL: Gestion simplifiaca de almacen\n");
      // Menu
      do {
        System.out.println("Opciones: \n");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificacion");
        System.out.println("5. Entrada de mercancia");
        System.out.println("6. Salida de mercancia");
        System.out.println("7. Salir");
        System.out.print("\nOpcion --> ");
        menu = Integer.parseInt(System.console().readLine());
        System.out.println("");
      } while (menu < 1 || menu > 7);

      // Programa
      switch (menu) {
        case 1:
          listado(articulos);
          break;
        case 2:
          alta(articulos);
          break;
        case 3:
          baja(articulos);
          break;
        case 4:
          modificacion(articulos);
          break;
        case 5:
          entradaM(articulos);
          break;
        case 6:
          salidaM(articulos);
          break;
        default:
          salir = true;
          break;
      }
    } while (!salir);

    System.out.println("\nGracias\n");
  }
}
