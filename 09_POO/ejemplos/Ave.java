/**
 * Clase Ave
 * Definicion de la clase Ave
 * 
 * Sub clase de Animal
 * 
 * Sub clases: Pinguino
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Ave extends Animal {

  //////// Atributos
  // No tiene atributos propios solo heredados

  //////// Contructores

  /**
   * Contructor donde le dira su sexo
   * 
   * @param s Sexo
   */
  public Ave(Sexo s) {
    super(s);
  }

  /**
   * Conctructor basico
   * 
   * Llama al coctructor de animal
   */
  public Ave() {
    super();
  }

  //////// Metodos

  /**
   * Hacer que el ave se limpie
   */
  public void aseate(){
    System.out.println("Me estoy limpiando las plumas");
  }

  /**
   * Hacer que el ave levante el vuelo
   */
  public void vuela(){
    System.out.println("Estoy volando");
  }
}
