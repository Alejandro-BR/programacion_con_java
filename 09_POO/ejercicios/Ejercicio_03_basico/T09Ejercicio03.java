/**
 * Ejercicio 3: ¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_03_basico;

public class T09Ejercicio03 {
  public static void main(String[] args) {
    Vivienda vivienda1 = new Vivienda("Malaga Campanillas", 80, 4);
    Piso piso1 = new Piso("Malaga capital", 30, 1, 2, 10);
    Casa casa1 = new Casa("Malaga Campanillas", 100, 6, 200);

    System.out.println();
    System.out.println(vivienda1);
    System.out.println(piso1);
    System.out.println(casa1);
    System.out.println();
  }
}
