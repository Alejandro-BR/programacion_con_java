/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio_02;

public class T09Ejericicio02 {

  public static void main(String[] args) {

    Bicicleta bicicleta1 = new Bicicleta();
    Coche coche1 = new Coche();

    int menu = 0;
    boolean salir = false;
    double kilometros;

    do {
      do {
        System.out.println();
        System.out.println("VEHICULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje totals");
        System.out.println("8. Salir");
        System.out.print("Elige una opción (1-8):");
        menu = Integer.parseInt(System.console().readLine());
        System.out.println();
      } while ((menu <= 8) && (menu >= 1) );
  
      switch (menu) {
        case 1:
          System.out.print("Introduce cuantos kilometros andaras: ");
          kilometros = Double.parseDouble(System.console().readLine());
          bicicleta1.andar(kilometros);
          break;
        default:
          break;
      }
    } while (salir);

  }

}