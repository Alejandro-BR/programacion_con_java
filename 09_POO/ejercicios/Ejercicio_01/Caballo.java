/**
 * Clase Caballo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_01;

public class Caballo {

  //////// Atributos
  private String color;
  private int edad;
  private String raza;
  private String nombre;
  private String sexo;
  private String[] comida = {"Pasto", "Zanaorias", "Algarrobas"};


  //////// Contructores

  /**
   * Conctructor complejo
   * 
   * @param color String
   * @param edad int
   * @param raza String
   * @param nombre String
   */
  public Caballo(String color, int edad, String raza, String nombre, String sexo) {
    this.color = color;
    this.edad = edad;
    this.raza = raza;
    this.nombre = nombre;
    this.sexo = sexo;
  }

  /**
   * Contructor sin nombre y sin sexo
   * 
   * @param color String
   * @param edad int
   * @param raza String
   */
  public Caballo(String color, int edad, String raza) {
    this.color = color;
    this.edad = edad;
    this.raza = raza;
  }

  //////// Metodos

  // Get para ver

  public String getColor() {
    return color;
  }

  public int getEdad() {
    return edad;
  }

  public String getRaza() {
    return raza;
  }

  public String getNombre() {
    return nombre;
  }

  // Set modificar

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  /**
   * Correr
   */
  public void correr(){
    System.out.println("Estoy corriendo muy rapido");
  }

  /**
   * Comer
   * 
   * @param comida String
   */
  public void comer(String comida){
    for (int i = 0; i < this.comida.length; i++) {
      if (comida == this.comida[i]) {
        System.out.println("Me gusta comer " + comida);
        return;  // Se sale del metodo  (break)
      } 
    }
    System.out.println("No me gusta " + comida);
  }

  /**
   * Relinchar
   */
  public void hablar(){
    System.out.println("¡hiiii, hiiii, hiiii!");
  }

  /**
   * Pelear
   * 
   * @param rival Objeto
   */
  public void pelear(Caballo rival){
    System.out.println("Que te reviento " + rival.getNombre());
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    return "Color = " + color + ", edad = " + edad + ", raza = " + raza + ", nombre = " + nombre + ", sexo = " + sexo;
  }

}
