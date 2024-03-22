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
  public Almacen(){
    this.articulos = new ArrayList<>();
  }

  //////// Metodos

  /**
   * listado:
   * 
   * Llama al toString de cada uno de los articulos.
   */
  public void listado(){
    for (Articulo articulo : articulos) {
      System.out.println(articulo);
    }
  }

  /**
   * listadoNumerado:
   * 
   * Llama al toString de cada uno de los articulos con un indice.
   */
  public void listadoNumerados(){
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
   * getArticulos
   * 
   * @return articulos Articulos[]
   */
  public ArrayList<Articulo> getArticulos() {
    return articulos;
  }
}
