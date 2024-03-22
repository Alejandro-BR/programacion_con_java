/**
 * Clase Almacen
 * 
 * Contiene un conjunto indefinido de articulos.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio13;

import java.util.ArrayList;

public class Almacen {
  //////// Atributos
  private ArrayList<Articulo> articulos;

  //////// Contructor
  /**
   * Contructor de Almacen
   */
  public Almacen() {
    this.articulos = new ArrayList<>();
  }

  //////// Metodos

  /**
   * listado:
   * 
   * Llama al toString de cada uno de los articulos.
   */
  public void listado() {
    for (Articulo articulo : articulos) {
      System.out.println(articulo);
    }
  }

  /**
   * listadoNumerado:
   * 
   * Llama al toString de cada uno de los articulos con un indice.
   */
  public void listadoNumerados() {
    for (int i = 0; i < articulos.size(); i++) {
      System.out.println((i + 1) + " - " + articulos.get(i));
    }
  }

  /**
   * alta:
   * 
   * Dar de alta a un nuevo articulo.
   * 
   * @param articulo Articulo
   */
  public void alta(Articulo articulo) {
    this.articulos.add(articulo);
  }

  /**
   * baja:
   * 
   * Dar de baja a un articulo
   * 
   * @param articulo Articulo
   */
  public void baja(Articulo articulo) {
    this.articulos.remove(articulo);
  }

  /**
   * modificacionCodigo:
   * 
   * Modifica el codigo de un articulo.
   * 
   * @param indice int
   * @param codigo int
   */
  public void modificacionCodido(int indice, int codigo) {
    articulos.get(indice).setCodigo(codigo);
  }

  /**
   * modificacionDescripcion:
   * 
   * Modifica la descripcion de un articulo.
   * 
   * @param indice      int
   * @param descripcion String
   */
  public void modificacionDescripcion(int indice, String descripcion) {
    articulos.get(indice).setDescripcion(descripcion);
  }

  /**
   * modificacionPrecioCompra:
   * 
   * Modifica el precio de compra de un articulo.
   * 
   * @param indice       int
   * @param precioCompra double
   */
  public void modificacionPrecioCompra(int indice, double precioCompra) {
    articulos.get(indice).setPrecioCompra(precioCompra);
  }

  /**
   * modificacionPrecioVenta:
   * 
   * Modifica el precio de venta de un articulo.
   * 
   * @param indice       int
   * @param precioCompra double
   */
  public void modificacionPrecioVenta(int indice, double precioVenta) {
    articulos.get(indice).setPrecioVenta(precioVenta);
  }

  /**
   * modificacionStock:
   * 
   * Modifica el stock de un articulo.
   * 
   * @param indice int
   * @param stock  int
   */
  public void modificacionStock(int indice, int stock) {
    articulos.get(indice).setStock(stock);
  }

  /**
   * entrada:
   * 
   * Aumento del stock de un articulo.
   * 
   * @param indice  int
   * @param aumento int
   */
  public void entrada(int indice, int aumento) {
    int stock = this.articulos.get(indice).getStock();
    this.articulos.get(indice).setStock(stock + aumento);
  }

  /**
   * venta:
   * 
   * Decremento del stock de un articulo.
   * 
   * @param indice  int
   * @param restado int
   */
  public void venta(int indice, int restado) {
    int stock = this.articulos.get(indice).getStock();
    this.articulos.get(indice).setStock(stock - restado);
  }

  /**
   * getArticulos
   * 
   * @return articulos Articulos[]
   */
  public ArrayList<Articulo> getArticulos() {
    return articulos;
  }
}
