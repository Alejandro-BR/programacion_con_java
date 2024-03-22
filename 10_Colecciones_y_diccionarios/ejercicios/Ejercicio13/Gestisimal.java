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
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio13;

import java.util.ArrayList;

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
    System.out.print("Introduce el stock: ");
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

    indice -= 1;
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

        almacen.modificacionCodido(indice, codigo); // Modifica el codigo
        break;
      case 2:
        String descripcion = introduceDescripcion();
        almacen.modificacionDescripcion(indice, descripcion); // Modifica la descripcion
        break;
      case 3:
        double precioCompra = introducePrecioCompra();
        almacen.modificacionPrecioCompra(indice, precioCompra); // Modifica el precio de compra
        break;
      case 4:
        double precioVenta = introducePrecioCompra();
        almacen.modificacionPrecioVenta(indice, precioVenta); // Modifica el precio de venta
        break;
      case 5:
        int stock = introduceStock();
        almacen.modificacionStock(indice, stock); // Modifica el stock
        break;
    }
  }

  /**
   * aumento:
   * 
   * Cuanto stock entra.
   * 
   * @return stock aumentado int
   */
  private static int aumento() {
    int aumento = 0;
    do {
      System.out.print("Introduce cuanto stock entrara: ");
      aumento = Integer.parseInt(System.console().readLine());
    } while (aumento > 0);
    return aumento;
  }

  /**
   * articuloQueAumenta
   * 
   * Pide el codigo y busca el indice para ese articulo.
   * 
   * @param almacen Almacen
   * @return indice int
   */
  private static int articuloQueAumenta(Almacen almacen) {
    int indice = 0;
    int codigo;
    Articulo aux;
    do {
      codigo = introduceCodigo();
      aux = new Articulo(codigo);
    } while (almacen.getArticulos().contains(aux));

    for (Articulo articulo : almacen.getArticulos()) {
      if (articulo.getCodigo() == codigo) {
        return indice;
      }
      indice++;
    }
    return -1;
  }

  /**
   * venta:
   * 
   * Gestiona todo lo relacionado con la venta
   * de un articulo y la llamada al metodo ticket.
   * 
   * @param almacen Almacen
   */
  private static void venta(Almacen almacen) {
    boolean salir = false;
    ArrayList<Articulo> articulosVendidos = new ArrayList<>();
    ArrayList<Integer> cantidades = new ArrayList<>();

    do {
      System.out.println("\nVentas:");
      int codigo = introduceCodigo();

      // Obtener el indice del articulo en el almacen
      int indice = -1;
      for (int i = 0; i < almacen.getArticulos().size(); i++) {
        if (almacen.getArticulos().get(i).getCodigo() == codigo) {
          indice = i;
          break;
        }
      }

      if (indice == -1) {
        System.out.println("El articulo  no se encuentra en el almacen.");
      } else {
        System.out.print("Introduce la cantidad a vender: ");
        int cantidad = Integer.parseInt(System.console().readLine());

        if ((almacen.getArticulos().get(indice).getStock() - cantidad) < 0) {
          System.out.println("No hay suficiente stock para realizar la venta.");
        } else {
          almacen.venta(indice, cantidad); // Llamar al metodo venta de Almacen
          cantidades.add(cantidad); // Agregar la cantidad
          articulosVendidos.add(almacen.getArticulos().get(indice)); // Agregar el articulo
        }
      }

      // Preguntar al usuario si desea realizar otra venta
      System.out.print("Nueva venta (si - 1 /no - 2): ");
      int respuesta = Integer.parseInt(System.console().readLine());
      if (respuesta == 2) {
        salir = true;
      } else if (respuesta == 1) {
        salir = false;
      }

    } while (!salir);

    // Imprimir el ticket
    ticket(cantidades, articulosVendidos, almacen);
  }


  /**
   * ticket:
   * 
   * Genera un ticket.
   * 
   * @param cantidades Integer[]
   * @param articulosVendidos Articulo[]
   * @param almacen Almacen
   */
  private static void ticket(ArrayList<Integer> cantidades, ArrayList<Articulo> articulosVendidos, Almacen almacen){
    double total = 0;
    double precioArticulos;

    System.out.println("\nTICKET DE VENTA\n");
    System.out.println("--------------------------------------------");
    for (int i = 0; i < articulosVendidos.size(); i++) {
      System.out.println("Artículo: " + articulosVendidos.get(i).getDescripcion());
      precioArticulos = (articulosVendidos.get(i).getPrecioVenta() * 1.21);
      System.out.printf("Precio unitario (con IVA): %.2f\n", precioArticulos);
      precioArticulos = (articulosVendidos.get(i).getPrecioVenta() * 1.21) * cantidades.get(i);
      System.out.printf("Subtotal (con IVA): %.2f\n", precioArticulos);
      total += precioArticulos;
      System.out.println("--------------------------------------------");
    }
    System.out.printf("Total de la venta: %.2f\n\n", total);
}


  ///////////////////////////  Main  ////////////////////////////////// 

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
          modificacion(almacen);
          break;
        case 5:
          // Entrada de mercancia
          almacen.entrada(articuloQueAumenta(almacen), aumento());
          break;
        case 6:
          // Venta
          venta(almacen);
          break;
        case 7:
          System.out.println("Saliendo del programa...");
          break;
      }

    } while (menu != 7);
  }
}
