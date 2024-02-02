/**
 * Clase Pinguino
 * Definicion de la clase Pinguino
 * 
 * Sub clase de la calse Ave
 * Que a su vez es sub clase de la clase Animal
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Pinguino extends Ave {

  //////// Atributos
  // No tiene atributos propios solo heredados

  //////// Contructores

  /**
   * Conctructor basico
   * 
   * Llama al coctructor de animal
   */
  public Pinguino() {
    super();
  }

  /**
   * Contructor donde le dira su sexo
   * 
   * @param s Sexo
   */
  public Pinguino(Sexo s) {
    super(s);
  }

  //////// Metodos

  /**
   * El pinguino se siente triste porque no puede volar
   */
  @Override
  public void vuela(){
    System.out.println("No puedo volar");
  }
}
