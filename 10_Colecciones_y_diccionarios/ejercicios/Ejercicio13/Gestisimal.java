/**
 * Ejercicio 13: Modifica el programa Gestisimal realizado anteriormente 
 * añadiendo las siguientes mejoras:
 * 
 * • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
 * 
 * • Comprueba la existencia del código en el alta, la baja y la modificación de
 * artículos para evitar errores.
 * 
 * • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá
 * hacer una venta de varios artículos y emitir la factura correspondiente.
 * 
 * Se debe preguntar por los códigos y las cantidades de cada artículo que
 * se quiere comprar. Aplica un 21% de IVA.
 * 
 * Programa original:
 * 
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
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
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio13;

public class Gestisimal {

  /**
   * nuevoArticulo:
   * 
   * Introducir los datos de un nuevo Articulo
   * 
   * @param almacen Almacen
   * @return articulo Alticulo
   */
  private static Articulo nuevoArticulo(Almacen almacen) {
    Articulo articulo;

    do {
      int codigo = introduceCodigo();
      String descripcion = introduceDescripcion();
      double precioCompra = introducePrecioCompra();
      double precioVenta = introducePrecioVenta();
      int stock = introduceStock();
      articulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
    } while (almacen.getArticulos().contains(articulo));

    return articulo;
  }

  /**
   * eleminarArticulo
   * 
   * Crea un objeto que el codigo sea identico al del almacen
   * para luego darlo de baja.
   * 
   * @param almacen Almacen
   * @return articulo Articulo
   */
  private static Articulo eleminarArticulo(Almacen almacen) {
    Articulo articulo;

    do {
      int codigo = introduceCodigo();
      articulo = new Articulo(codigo);
    } while (!almacen.getArticulos().contains(articulo));

    System.out.println("Articulo " + articulo.getCodigo() + " eliminado.");
    return articulo;
  }

  /**
   * Introducir el codigo
   * 
   * @return codigo int
   */
  private static int introduceCodigo() {
    System.out.print("\nIntroduce el codigo: ");
    int codigo = Integer.parseInt(System.console().readLine());
    System.out.println();
    return codigo;
  }

  /**
   * Introducir el stock
   * 
   * @return stock int
   */
  private static int introduceStock() {
    System.out.print("\nIntroduce el stock: ");
    int stock = Integer.parseInt(System.console().readLine());
    System.out.println();
    return stock;
  }

  /**
   * Introducir el precio de compra
   * 
   * @return precio double
   */
  private static double introducePrecioCompra() {
    System.out.print("Introduce el precio de compra: ");
    double precioCompra = Double.parseDouble(System.console().readLine());
    System.out.println();
    return precioCompra;
  }

  /**
   * Introducir el precio de venta
   * 
   * @return precio double
   */
  private static double introducePrecioVenta() {
    System.out.print("Introduce el precio de venta: ");
    double precioVenta = Double.parseDouble(System.console().readLine());
    System.out.println();
    return precioVenta;
  }

  /**
   * Introducir la descripcion
   * 
   * @return descripcion String
   */
  private static String introduceDescripcion() {
    System.out.print("Introduce la descripcion: ");
    String descripcion = System.console().readLine();
    System.out.println();
    return descripcion;
  }

  /**
   * Modificacion de un articulo.
   * 
   * @param almacen Almacen
   */
  public static void modificacion(Almacen almacen) {
    System.out.println("\nListado: ");
    almacen.listadoNumerados();

    int indice;
    do {
      System.out.print("\nIntroduce el indice del elemento a modificar: ");
      indice = Integer.parseInt(System.console().readLine());
    } while (indice < 1 || indice > (almacen.getArticulos().size() + 1));

    int menu;

    System.out.println("\nQue quiereres modificar: ");
    System.out.println("1. Codigo");
    System.out.println("2. Descripcion");
    System.out.println("3. Precio de compra");
    System.out.println("4. Precio de venta");
    System.out.println("5. Stock");
    do {
      System.out.print("Opcion --> ");
      menu = Integer.parseInt(System.console().readLine());
      System.out.println();
    } while (menu < 1 || menu > 5);

    switch (menu) {
      case 1:
        Articulo articulo;
        int codigo;

        // Comprueba que el codigo no exista
        do {
          codigo = introduceCodigo();
          articulo = new Articulo(codigo);
        } while (!almacen.getArticulos().contains(articulo));

        almacen.getArticulos().get(indice - 1).setCodigo(codigo); // Modifica el codigo
        break;
      case 2:
        String descripcion = introduceDescripcion();
        almacen.getArticulos().get(indice - 1).setDescripcion(descripcion); // Modifica la descripcion
        break;
      case 3:
        double precioCompra = introducePrecioCompra();
        almacen.getArticulos().get(indice - 1).setPrecioCompra(precioCompra); // Modifica el precio de compra
        break;
      case 4:
        double precioVenta = introducePrecioCompra();
        almacen.getArticulos().get(indice - 1).setPrecioVenta(precioVenta); // Modifica el precio de venta
        break;
      case 5:
        int stock = introduceStock();
        almacen.getArticulos().get(indice - 1).setStock(stock); // Modifica el stock
        break;
    }
  }

  public static void main(String[] args) {
    Almacen almacen = new Almacen();
    int menu = 0;
    do {
      System.out.println("\nGESTISIMAL: Gestion simplifiaca de almacen\n");
      System.out.println("Opciones: \n");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancia");
      System.out.println("6. Venta");
      System.out.println("7. Salir");

      // Repetir si no esta entre los valores 1 - 7
      do {
        System.out.print("\nOpcion --> ");
        menu = Integer.parseInt(System.console().readLine());
        System.out.println();
      } while (menu < 1 || menu > 7);

      switch (menu) {
        case 1:
          // Listado
          almacen.listado();
          System.out.println();
          break;
        case 2:
          // Nuevo articulo
          almacen.alta(nuevoArticulo(almacen));
          break;
        case 3:
          // Eliminar un articulo
          almacen.baja(eleminarArticulo(almacen));
          break;
        case 4:
          // Modificar un articulo
          break;
        case 7:
          System.out.println("Saliendo del programa...");
          break;
      }

    } while (menu != 7);
  }
}
