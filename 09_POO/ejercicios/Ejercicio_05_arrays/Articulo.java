/**
 * Clase Articulo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_05_arrays;

public class Articulo {
  //////// Atributos
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  //////// Contructor
  /**
   * Contructor completo
   * 
   * @param codigo       int
   * @param descripcion  String
   * @param precioCompra double
   * @param precioVenta  double
   * @param stock        int
   */
  public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }

  /**
   * Contructor basico
   */
  public Articulo() {

  }

  //////// Metodos

  /**
   * Aumentar el stock
   * 
   * @param cantidad int
   */
  public void entrada(int cantidad) {
    this.stock += cantidad;
  }

  /**
   * Disminuir el stock
   * 
   * @param cantidad int
   */
  public void salida(int cantidad) {
    if (cantidad <= stock) {
      this.stock -= cantidad;
    } else {
      System.out.println("\nError: falta stock para un pedido tan grande.\n");
    }

  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Articulo codigo = " + codigo + ", descripcion = " + descripcion + ", precioCompra = " + precioCompra
        + ", precioVenta = " + precioVenta + ", stock = " + stock + " ";
  }

  // Geters y Seters

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}
