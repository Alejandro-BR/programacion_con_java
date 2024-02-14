/**
 * Probar la clase alumno
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class AppAlumnos {
  public static void main(String[] args) {
    Alumno[] alumnos = new Alumno[5];
    String nombre;
    Double notamedia;

    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      System.out.print("Nombre del alumno " + i + ": ");
      nombre = System.console().readLine(); 
      alumnos[i].setNombre(nombre);
      System.out.print("Introduce la nota media: ");
      notamedia = Double.parseDouble(System.console().readLine()); 
      alumnos[i].setNotaMedia(notamedia);
    }

    //Lectura con toString
    for (Alumno a : alumnos) {
      System.out.println(a.toString());
    }

    System.out.println();
    
    // alumnos[1] = null;  //Borra el alumno da error hacerlo asi si despues lo muestras

    //Lectura con getters
    for (Alumno a : alumnos) {
      System.out.println("Nombre: " + a.getNombre() + " Nota meida del alumno: " + a.getNotaMedia() );
    }

  }
}