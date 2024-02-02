/**
 * Clase Animal
 * 
 * Definicion de la clase animal
 * 
 * Esta es la Super Clase y ademas es abtract por lo que no se le podra crear ictancias
 * 
 * 
 * Sub clases: Mamifero  Ave Lagarto
 * 
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public abstract class Animal {

  //////// Atributos
  private Sexo sexo;

  //////// Contructores
  /**
   * Contructor basico
   * 
   */
  public Animal() {
    sexo = Sexo.MACHO;
  }

  /**
   * Contructor especificando el sexo
   * 
   * @param s Atributo de tipo enumerado Sexo
   */
  public Animal(Sexo s) {
    sexo = s;
  }

  //////// Metodos

  /**
   * Get del atributo sexo
   * 
   * @return Sexo
   */
  public Sexo getSexo() {
    return sexo;
  }

  /**
   * toString
   */
  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }

  /**
   * Metodo dormir
   */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }

  /**
   * Comer
   */
  public void comer(String comida){
    System.out.println("Que rico " + comida);
  }
}
