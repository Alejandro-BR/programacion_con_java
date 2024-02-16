/**
 * Clase Disco
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_03_arrays;

public class Disco {
  //////// Atributos
  private String codigo;
  private String nombre;
  private String album;
  private String artista;
  private int horasDuracion;

  //////// Constructor
  /**
   * Contructor de la clase
   */
  public Disco() {
    this.codigo = "LIBRE";
  }

  //////// Metodos

  /**
   * Borrar el discos, recetea todo los valores
   * 
   */
  public void borrar(){
    codigo = "LIBRE";
    nombre = null;
    album = null;
    artista = null;
    horasDuracion = 0;
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Disco " + nombre + " : codigo = " + codigo + 
    ", album = " + album + ", artista = " + artista
        + ", horasDuracion = " + horasDuracion + " ";
  }

  /**
   * Obtener el codigo
   * 
   * @return String
   */
  public String getCodigo() {
    return codigo;
  }

  /**
   * Modficiar el codigo
   * 
   * @param codigo
   */
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  /**
   * Obtener el nombre
   * 
   * @return String
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Mofificar el nombe
   * 
   * @param nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Obtener el album
   * 
   * @return String
   */
  public String getAlbum() {
    return album;
  }

  /**
   * Modificar el album
   * 
   * @param album
   */
  public void setAlbum(String album) {
    this.album = album;
  }

  /**
   * Obtener el artista
   * 
   * @return String
   */
  public String getArtista() {
    return artista;
  }

  /**
   * Modificar el artista
   * 
   * @param artista
   */
  public void setArtista(String artista) {
    this.artista = artista;
  }

  /**
   * Obtener las horas de duracion
   * 
   * @return int
   */
  public int getHorasDuracion() {
    return horasDuracion;
  }

  /**
   * Modificar las horas de duracion
   * 
   * @param horasDuracion
   */
  public void setHorasDuracion(int horasDuracion) {
    this.horasDuracion = horasDuracion;
  }

}
