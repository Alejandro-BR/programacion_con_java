/**
 * SubClase Lagarto
 * 
 * Subclase de animal
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Lagarto extends Animal {
  
  //////// Atributos
  private String tamaño;

  //////// Constructor 

  /**
   * Contructor especificando el sexo
   * 
   * @param s Atributo de tipo enumerado Sexo
   */
  public Lagarto(Sexo s, String tamaño) {
    super(s);
    this.tamaño = tamaño;
  }

  //////// Metodos

    /**
   * toString
   */
  @Override
  public String toString() {
    return super.toString() + " tamaño = " + tamaño;
  }
}
