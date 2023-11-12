/**
 * Ejercicio 25: La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 * 
 * Ejemplo 1:
 * 
 * Introduzca la altura de la bandera en cm: 20
 * Ahora introduzca la anchura: 35
 * ¿Quiere escudo bordado? (s/n): n
 * Gracias. Aquí tiene el desglose de su compra.
 * Bandera de 700 cm2: 7,00 €
 * Sin escudo: 0,00 €
 * Gastos de envío: 3,25 €
 * Total: 10,25 €
 * 
 * Ejemplo 2:
 * 
 * Introduzca la altura de la bandera en cm: 10
 * Ahora introduzca la anchura: 15
 * ¿Quiere escudo bordado? (s/n): s
 * Gracias. Aquí tiene el desglose de su compra.
 * Bandera de 150 cm2: 1,50 €
 * Con escudo: 2,50 €
 * Gastos de envío: 3,25 €
  Total: 7,25 €
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio25 {
  public static void main(String[] args) {
    String escudo = "";
    double total;

    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = sc.nextInt();
    System.out.print("Ahora introduzca la anchura: ");
    int ancho = sc.nextInt();
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    escudo = sc.next();
    sc.close(); //Cierre del Scanner
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");

    double tamaño = altura * ancho;
    double precio = tamaño / 100;

    System.out.println(""); //SALTO DE LINEA 

    System.out.printf("%-10s %4.0f cm2: %6.2f €\n","Bandera de",tamaño,precio); 

    if (escudo.equals("s")) {
      System.out.println("Con escudo:            2.50 €"); 
      total = precio + 2.50 + 3.25;
    } else {
      System.out.println("Sin escudo:            0.00 €");
      total = precio + 3.25;
    }

      System.out.println("Gastos de envio:       3.25 €");
      System.out.printf("%-20s %6.2f €","Total:",total); 
      System.out.println(""); //SALTO DE LINEA 
      
  }
}
