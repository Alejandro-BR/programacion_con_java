/**
 * Clase Gato
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Gato implements Comparable<Gato> {
  // Atributos
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;

  // Constructores
  Gato(String nombre) {
    this.nombre = nombre;
    this.color = "Azul";
    this.raza = "Romano";
  }

  Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
    this.peso = peso;
  }

  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }

  // Metodos
  void maulla() {
    System.out.println("Miaaaaaaaau!");
  }

  void ronronea() {
    System.out.println("Brrrrrrrr");
  }

  void come(String comida) {
    if (comida.equalsIgnoreCase("pescado")) {
      System.out.println("Ñam ñam!");
    } else {
      System.out.println("Soy un gato y solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos
   * Solo se van a pelear dos machos entre si
   * 
   * @param contrincante
   */
  void peleaCon(Gato contrincante) {
    if (this.sexo.equals(contrincante.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aqui, que te reviento");
    } else {
      System.out.println("No me gusta pelear");
    }
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad
        + ", peso=" + peso + "]";
  }

  @Override
  public int compareTo(Gato g) {
    return (this.nombre).compareTo(g.getNombre());
  }

}
