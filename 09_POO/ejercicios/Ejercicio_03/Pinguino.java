/**
 * Clase Pinguino
 * Definicion de la clase Pinguino
 * 
 * Sub clase de la calse Ave
 * Que a su vez es sub clase de la clase Animal
 * 
 * @author Alejandro Barrionuevo Rosado
 */
package Ejercicio_03;
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
  public void vuela() {
    System.out.println("No puedo volar");
  }

  /**
   * Hace que el canario coma
   * 
   * @param comida
   */
  @Override
  public void comer(String comida){
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
      System.out.println("Me encanta los pescado");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }
}
