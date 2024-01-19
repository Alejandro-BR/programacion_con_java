/**
 * Clase Cubo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Cubo {

  // Atributos de la clase
  private int capacidad; // Capacidad máxima
  private int contenido; // Contenido de litros

  // Constructor

  public Cubo(int cap) {
    this.capacidad = cap;
  }

  public Cubo(int capacidad, int contenido) {
    this.capacidad = capacidad;
    this.contenido = contenido;
  }

  // Getters
  public int getCapacidad() {
    return this.capacidad;
  }

  public int getContenido() {
    return this.contenido;
  }

  // Setters
  public void setContenido(int litros) {
    this.contenido = litros;
  }

  // Metodos
  public void vacia() {
    this.contenido = 0;
  }

  public void llena() {
    this.contenido = this.capacidad;
  }

  // Pinta el cubo
  public void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
      if (this.contenido >= nivel) {
        System.out.println("#~~~~#");
      } else {
        System.out.println("#    #");
      }
    }
    System.out.println("######");
  }

  /**
   * Vuelca el contenido de un cubo sobre otro.
   * Antes de echar el agua se comprueba cuánto le cabe al
   * cubo destino.
   */
  void vuelcaEn(Cubo destino) {
    int libres = destino.getCapacidad() - destino.getContenido();
    if (libres > 0) {
      if (this.contenido <= libres) {
        destino.setContenido(destino.getContenido() + this.contenido);
        this.vacia();
      } else {
        this.contenido -= libres;
        destino.llena();
      }
    }
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  @Override
  public String toString() {
    return "Cubo [capacidad=" + this.capacidad + ", contenido=" + this.contenido + "]";
  }

}
