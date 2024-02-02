/**
 * Clase Mamifero
 * 
 * Subclase de animal y superclase de gato y perro
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public abstract class Mamifero extends Animal{
  //////// Atributos
  //////// Constructor

  /**
   * Contructor basico
   */
  public Mamifero(){
    super();
  }

    /**
   * Contructor el cual se recibe el sexo y la raza
   * 
   * @param s  Sexo
   */
  public Mamifero(Sexo s) {
    super(s);
  }

  //////// Metodos

  public void soyMamifero(){
    System.out.println("Soy un mamifero");
  }
}
