/**
 * Clase Articulo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio13;

public class Articulo {
  //////// Atributos
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  //////// Contructores
  /**
   * Contructor de Articulo
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
   * 
   * @param codigo int
   */
  public Articulo(int codigo) {
    this.codigo = codigo;
  }

  //////// Metodos

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Articulo " + codigo + ", " + descripcion + ", precio de compra = " + precioCompra
        + ", precio de venta = " + precioVenta + ", stock = " + stock + " ";
  }

  /**
   * equals
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    Articulo other = (Articulo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  // Getter y setter 

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
