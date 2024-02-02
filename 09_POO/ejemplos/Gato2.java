/**
 * Clase Gato2
 * Definicion de la clase gato
 * 
 * Sub clase de Animal
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Gato2 extends Animal {

  //////// Atributos
  private String raza;

  //////// Contructores
  /**
   * Contructor el cual se recibe el sexo y la raza
   * 
   * @param s    Sexo
   * @param raza String
   */
  public Gato2(Sexo s, String raza) {
    super(s);
    this.raza = raza;
  }

  /**
   * Contructor donde se resive la raza
   * Sexo: Hembra
   * 
   * @param raza String
   */
  public Gato2(String raza) {
    super(Sexo.HEMBRA);
    this.raza = raza;
  }

  /**
   * Contructor donde se resive el sexo
   * Raza: Siames
   * 
   * @param s Sexo
   */
  public Gato2(Sexo s) {
    super(s);
    raza = "Siames";
  }

  /**
   * Constructor basico
   * 
   * Sexo: Hembra
   * Raza: Siames
   */
  public Gato2() {
    super(Sexo.HEMBRA);
    raza = "Siames";
  }

  //////// Metodos

  /**
   * toString
   */
  public String toString() {
    return super.toString()
        + "Raza: " + this.raza + "\n";
  }

  /**
   * Hace que el gato maulle.
   */
  public void maulla() {
    System.out.println("Miauuuu!");
  }

  /**
   * Hace que el gato ronronee
   */
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma
   * A los gatos les gusta el pescado, si le dmaos otra comida
   * la rechazara
   * 
   * @param comida String de la comida que se le ofrece
   */
  public void come(String comida){
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
      System.out.println("Me encanta el pescado");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos
   * Solo se pelearan si los dos son machos
   * 
   * @param contrincante Clase Gato2
   */
  public void peleaCon(Gato2 contrincante){
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("No me gusta pelear");
    } else {
      if (contrincante.getSexo() == Sexo.HEMBRA) {
        System.out.println("No peleo con gatitas");
      } else {
        System.out.println("Ven aqui que te reviento");
      }
    }
  }
}
