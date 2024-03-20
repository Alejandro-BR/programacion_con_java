/**
 * Ejercicio 15: Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: 
 * Si algún producto se repite en diferentes líneas, se deben agrupar en una sola.
 * Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en
 * el extracto se debe mostrar que se han pedido 4 botes de tomate. Después de
 * teclear “fin”, el programa pide un código de descuento. Si el usuario introduce
 * el código “ECODTO”, se aplica un 10% de descuento en la compra.
 * 
 * Ejemplo:
 * 
 * Producto: tomate
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: avena
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: tomate
 * Cantidad: 2
 * Producto: fin
 * Introduzca código de descuento (INTRO si no tiene ninguno): ECODTO
 * 
 * Producto Precio Cantidad Subtotal
 * ---------------------------------
 * tomate 1,59 3 4,77
 * quinoa 4,50 4 18,00
 * avena 2,21 1 2,21
 * ---------------------------------
 * Descuento: 2,50
 * ---------------------------------
 * TOTAL: 22,48
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio15;

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
    HashMap<String, Integer> pedidos = new HashMap<>();
    String pedido = "";
    double precio = 0;
    boolean seguir = true;
    String codDescuento = "";
    double descuento = 0;
    boolean correcto = false;
    int cantidad = 0;

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

      // Comprobar si se termina
      if (pedido.equals("fin")) {
        seguir = false;
      } else {
        // Cantidad
        do {
          System.out.print("Cantidad: ");
          cantidad = Integer.parseInt(System.console().readLine());
        } while (cantidad < 1);

        // Actualizar pedido
        if (pedidos.containsKey(pedido)) {
          int cantidadActual = pedidos.get(pedido);
          pedidos.put(pedido, cantidadActual + cantidad);
        } else {
          pedidos.put(pedido, cantidad);
        }

        // Actualizar precio
        precio += (cantidad * productos.get(pedido));
      }

    } while (seguir);

    // Descuento
    do {
      System.out.print("\nIntroduzca código de descuento (INTRO si no tiene ninguno): ");
      codDescuento = System.console().readLine();
    } while (!codDescuento.equals("ECODTO") && !codDescuento.equals(""));

    // Aplicar descuento si es necesario
    if (codDescuento.equals("ECODTO")) {
      descuento = precio * 0.1; // 10% de descuento
    }

    // Imprimir ticket
    System.out.println("\nProducto  Precio  Cantidad  Subtotal");
    System.out.println("---------------------------------");
    for (String p : pedidos.keySet()) {
      double subtotal = pedidos.get(p) * productos.get(p);
      System.out.printf("%-9s %4.2f €  %-9d %-4.2f €\n", p, productos.get(p), pedidos.get(p), subtotal);
    }
    System.out.println("---------------------------------");
    System.out.printf("Descuento: %-4.2f € \n", descuento);
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %-4.2f € \n \n", (precio - descuento));
  }
}