/**
 * Super Clase Animal
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_01;

public abstract class Animal {

  //////// Atributos
  private String sexo;
  private int edad;

  //////// Contructores
  public Animal(String sexo, int edad) {
    this.sexo = sexo;
    this.edad = edad;
  }

  //////// Metodos

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "Animal sexo =" + sexo + ", edad =" + edad;
  }

  
}
