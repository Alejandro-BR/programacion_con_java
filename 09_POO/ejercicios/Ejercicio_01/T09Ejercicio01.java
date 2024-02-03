/**
 * Ejercicio 1: Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_01;

public class T09Ejercicio01 {
  public static void main(String[] args) {
    Caballo caballo1 = new Caballo("Negro", 15, "Pura sangre");
    caballo1.setNombre("Tornado");
    System.out.println(caballo1.getNombre());
    int edad =  caballo1.getEdad();

    System.out.println();

    Caballo caballo2 = new Caballo("Blanco", 20, caballo1.getRaza(), "Juan", "Macho");

    caballo1.pelear(caballo2);

    System.out.println();
    System.out.println(caballo1);  // Es lo mismo ponerlo asi
    System.out.println(caballo1.toString()); // que ponerlo asi
    System.out.println(caballo2 + " Caballo 2"); 

    String frase ="Este caballo es el mejor: " + caballo1.toString();

    System.out.println(frase);
  }
}
