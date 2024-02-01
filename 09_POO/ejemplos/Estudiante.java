/**
 * Subclase de persona
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Estudiante extends Persona {
  //////// Atributos
  private int creditos;

  //////// Contructores
  public Estudiante(String nombre, int edad, String dni) {
    super(nombre, edad, dni); // Contructor de Persona
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  //////// Metodos
  public int getCreditos() {
    return creditos;
  }

  // @Override
  // public void mostrarDatos(){
  // super.mostrarDatos(); //Llamo a mostrar datos de la superclase persona
  // System.out.println("Estuadiante matriculado de " + creditos + " creditos.");
  // }

  @Override
  public String toString() {
    return super.toString() + " [Etudiante] Creditos:" + creditos;
  }

}
