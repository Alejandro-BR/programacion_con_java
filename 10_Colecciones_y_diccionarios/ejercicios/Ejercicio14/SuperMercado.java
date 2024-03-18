/**
 * Ejercicio 14: Un supermercado de productos ecológicos nos ha pedido hacer un programa
 * para vender su mercancía. En esta primera versión del programa se tendrán
 * en cuenta los productos que se indican en la tabla junto con su precio. Los
 * productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
 * indicar el producto y el número de unidades que se compran, por ejemplo
 * “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
 * ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra
 * “fin. Suponemos que el usuario no va a intentar comprar un producto que
 * no existe. Utiliza un diccionario para almacenar los nombres y precios de los
 * productos y una o varias listas para almacenar la compra que realiza el usuario.
 * A continuación se muestra una tabla con los productos disponibles y sus
 * respectivos precios:
 * avena garbanzos tomate jengibre quinoa guisantes
 * 2,21 2,39 1,59 3,13 4,50 1,60
 * 
 * Ejemplo:
 * 
 * Producto: tomate
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: avena
 * Cantidad: 1
 * Producto: tomate
 * Cantidad: 2
 * Producto: fin
 * Producto Precio Cantidad Subtotal
 * ---------------------------------
 * tomate 1,59 1 1,59
 * quinoa 4,50 2 9,00
 * avena 2,21 1 2,21
 * tomate 1,59 2 3,18
 * ---------------------------------
 * TOTAL: 15,98
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio14;

import java.util.ArrayList;
import java.util.HashMap;

public class SuperMercado {
  public static void main(String[] args) {
    // Productos
    HashMap<String, Double> productos = new HashMap<String, Double>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);

    // Mostrar productos
    System.out.println("\nProductos: ");
    for (String producto : productos.keySet()) {
      System.out.println(producto + " - " + productos.get(producto));
    }

    // Programa
    ArrayList<String> pedidos = new ArrayList<>();
    ArrayList<Integer> cantidades = new ArrayList<>();
    String pedido = "";
    double precio = 0;
    int cantidad = 0;
    boolean seguir = true;
    boolean correcto = false;
    int contador = 0;

    do {
      // Producto
      do {
        System.out.print("\nProducto: ");
        pedido = System.console().readLine();

        // Comprobar si esta
        for (String producto : productos.keySet()) {
          if (pedido.equals(producto)) {
            correcto = true;
            break;
          }
        }

        // Comprobar si se termina
        if (pedido.equals("fin")) {
          seguir = false;
          correcto = true;
        }

      } while (!correcto);
      correcto = false;

      if (!pedido.equals("fin")) {
        // Cantidad
        do {
          System.out.print("\nCantidad: ");
          cantidad = Integer.parseInt((System.console().readLine()));

          if (cantidad > 0) {
            correcto = true;
          }
        } while (!correcto);
        correcto = false;
      }

      // Precio
      for (String producto : productos.keySet()) {
        if (pedido.equals(producto)) {
          pedidos.add(pedido);
          cantidades.add(cantidad);
          precio += (cantidad * productos.get(pedido));
          break;
        }
      }

    } while (seguir);

    System.out.println("\nProducto  Precio  Cantidad  Subtotal");
    System.out.println("---------------------------------");
    for (String p : pedidos) {
      System.out.printf("%-9s %4.2f €  %-9d %-4.2f €\n", p, productos.get(p), cantidades.get(contador),
          (productos.get(p) * cantidades.get(contador)));
      contador++;
    }
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %-4.2f € \n \n", precio);
  }
}
