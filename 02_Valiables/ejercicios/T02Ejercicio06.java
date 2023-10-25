/**
 * Esjercicio 6: Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T02Ejercicio06 {
  public static void main(String[] args) {
    //el porcentaje de IVA en españa es de 21% es decir multiplicar por 0.21
    double baseImposible = 30;
    double iva = baseImposible * 0.21;
    double total = baseImposible + iva;

   //System.out.println(euros + "€  --> " + pesetas + " pta");
   //System.out.printf("%.2f € --> %d pta\n", euros + pesetas);

    System.out.println("***************************");
    System.out.println("");
    System.out.println("     Ticket de compra");
    System.out.println("");
    System.out.println("***************************");


  }
}
