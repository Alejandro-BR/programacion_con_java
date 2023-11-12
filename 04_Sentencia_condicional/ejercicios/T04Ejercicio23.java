/**
 * Ejercicio 23: Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * Ejemplo:
 * 
 * Introduzca la base imponible: 25
 * Introduzca el tipo de IVA (general, reducido o superreducido): reducido
 * Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
 * Base imponible 25.00
 * IVA (10%) 2.50
 * Precio con IVA 27.50
 * Cód. promo. (mitad): -13.75
  TOTAL 13.75
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T04Ejercicio23 {
  public static void main(String[] args) {
    double iva = 0.21;
    double descuento = 0;

    System.out.println(""); //SALTO DE LINEA 

    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIva = System.console().readLine().toLowerCase();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigo = System.console().readLine().toLowerCase();

    switch (tipoIva) {
      case "general":
        iva = 0.21;
        break;
      case "reducido":
        iva = 0.10;
        break;
      case "superreducido":
        iva = 0.04;
        break;
      default:
        System.out.println("Al no señalar el tipo de IVA se usara el general es decir el 21%");
        break;
    }

    double precioConIva = baseImponible + (baseImponible * iva);
    
    switch (codigo) {
      case "nopro":
        descuento = 0;
        break;
      case "mitad":
        descuento = precioConIva / 2;
        break;
      case "meno5":
        descuento = 5;
        break;
      case "5porc":
        descuento = precioConIva * 0.05;
        break;
      default:
        System.out.println("No introduciste correctamente ningun codgio promocional.");
        break;
    }

    double total = precioConIva - descuento;

    System.out.println(""); //SALTO DE LINEA
    System.out.printf("%-23s %7.2f €\n","Base imponible",baseImponible); 
    //System.out.printf("%-23s %7.2f €\n","IVA (10%)",(baseImponible * iva));
    System.out.printf("%-4s (%8s) %15.2f €\n","IVA ",tipoIva,(baseImponible * iva)); 
    System.out.printf("%-23s %7.2f €\n","Precio con IVA",baseImponible * iva); 
    System.out.printf("%-13s %5s %3s %7.2f €\n","Cód. promo. (",codigo,"): ",(-1 * descuento)); 
    System.out.printf("%-23s %7.2f €\n","TOTAL",total);
    System.out.println(""); //SALTO DE LINEA

  }
}
