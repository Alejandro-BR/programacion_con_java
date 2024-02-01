/**
 * Clase persona que nos permitira reutilizala para ver el concepto de herencia en poo
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Persona {
  ////////Atributos
  private String nombre;
  private int edad;
  private String dni;

  ////////Contructor
  /**
   * Este es el contructor
   * @param nombre String
   * @param edad int
   * @param dni String
   */
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

    ////////Metodos

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return dni;
  }

  // public void mostrarDatos(){
  //   System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni);
  // }

  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni;
  }

  
}
