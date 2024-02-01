/**
 * Clase que contendra el metodo main para probar la herencia
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Persona p = new Persona("Pepe Rodriguez", 30, "12345689A");
    Estudiante e = new Estudiante("Paula Gomez", 21, "24346554A");
    Profesor prof = new Profesor("Sergio", 34, "233546457B", "Informatica", 10000.85);

    // p.mostrarDatos();
    // e.mostrarDatos();

    System.out.println(p.toString());
    System.out.println(p);

    System.out.println(e.toString());
    System.out.println(e);

    System.out.println(prof.toString());
    System.out.println(prof);

  }
}
