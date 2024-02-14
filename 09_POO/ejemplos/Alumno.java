/**
 * Clase Alumno 
 * Ejemplo de la clase del dia 14/2
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Alumno {
  ////////Atributos
  private String nombre;
  private double notaMedia = 0.0;

  public String getNombre() { return nombre;}

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getNotaMedia() {
    return notaMedia;
  }

  public void setNotaMedia(double notaMedia) {
    this.notaMedia = notaMedia;
  }

  @Override
  public String toString() {
    return "Alumno nombre = " + nombre + ", notaMedia = " + notaMedia + " ";
  }


}
