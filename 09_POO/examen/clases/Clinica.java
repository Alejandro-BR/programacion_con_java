/**
 * Clase Clinica
 * 
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package clases;

public class Clinica {
  //////// Atributos
  private final int N = 100;
  private Mascota[] listado;

  //////// Contructor
  /**
   * Contructor
   * 
   * Iniciliza el listado de mascotas
   * para que pueda albergar 100 mascotas.
   */
  public Clinica() {
    listado = new Mascota[N];
  }

  //////// Metodos

  /**
   * esVacia
   * 
   * @return boolean
   *         false --> no esta vacia la clinica
   *         true --> esta vacia la clinica
   */
  public boolean esVacia() {
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] != null) {
        return false; // No esta vacio
      }
    }
    return true; // Esta vacio
  }

  /**
   * esLlena
   * 
   * @return boolean
   *         false --> no esta llena la clinica
   *         true --> si esta llena la clinica
   */
  public boolean esLlena() {
    for (int i = 0; i < listado.length; i++) {
      if (listado[i] == null) {
        return false; // No esta lleno
      }
    }
    return true; // Esta lleno
  }

  /**
   * Numero total de gatos dados de alta.
   * 
   * @return int
   */
  public int totalGatos() {
    return Gato.getTotalGatos();
  }

  /**
   * Numero total de perros dados de alta.
   * 
   * @return int
   */
  public int totalPerros() {
    return Perro.getTotalPerros();
  }

  /**
   * Numero total de mascotas dados de alta.
   * 
   * @return int
   */
  public int totalMascotas() {
    return Mascota.getTotalMascotas();
  }

  /**
   * Busca una mascota por el chip y
   * la devuelve si se encuentra dentro del listado.
   * 
   * @param chip String
   * @return Mascota
   *         null en caso de no encontrarla
   */
  public Mascota buscarChip(String chip) {
    for (Mascota mascota : listado) {
      if (mascota != null && mascota.getChip().equals(chip)) {
        return mascota; //Devuelve la mascota
      }
    }
    return null; //Salta una excepcion 
  }

  /**
   * Agregar una mascota al listado de la clinica.
   * Solo lo hara si hay hueco en la lista.
   * 
   * @param mascota Perro o Gato
   */
  public void agregar(Mascota mascota) {
    if (esLlena()) { // Si esta llena avisa
      System.out.println("No hay hueco en la lista.");
    } else { // Si no esta llena lo añade en el hueco que tenga disponible
      for (int i = 0; i < listado.length; i++) {
        if (listado[i] == null) { 
          listado[i] = mascota; //Se añade la mascota
          break; // Sale del bucle
        }
      }
    }
  }

  /**
   * Listar los elementos de la lista.
   */
  public void listar() {
    //No me gustaba que se quedara pegado a la opcion
    System.out.println();  // y le puse esto
    for (Mascota mascota : listado) {
      if (mascota != null) { //Si la mascota existe
        System.out.println(mascota); //toString
      }
    }
  }
}
