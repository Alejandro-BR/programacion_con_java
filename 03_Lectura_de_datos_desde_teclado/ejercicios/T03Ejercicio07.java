/**
 * Ejercicio 7: Escribe un programa que calcule el total de una factura a partir de la base imponible.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

public class T03Ejercicio07 {
  public static void main(String[] args) {
    //el porcentaje de IVA en españa es de 21% es decir multiplicar por 0.21
    double baseImponible;
    double iva = 0.21;
    double ivaProducto;
    double total;
    double pago;
    double cambio;
    int dia;
    int mes;
    int año;
    
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("TIENDA:");
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.print("Precio del producto: ");
    baseImponible = sc.nextDouble();

    System.out.println(""); //SALTO DE LINEA 

    System.out.print("Introduce el dia: ");
    dia = sc.nextInt();
    System.out.print("Introduce el mes: ");
    mes = sc.nextInt();
    System.out.print("Introduce el año: ");
    año = sc.nextInt();

    System.out.println(""); //SALTO DE LINEA 

    System.out.print("Introduce cuanto pago el cliente: ");
    pago = sc.nextDouble();

    System.out.println(""); //SALTO DE LINEA 
    System.out.println(""); //SALTO DE LINEA 

    sc.close(); //Cierre del Scanner 

    ivaProducto = baseImponible * iva;
    total = ivaProducto + baseImponible;
    cambio = pago - total;

    //System.out.println(euros + "€  --> " + pesetas + " pta");
    //System.out.printf("%.2f € --> %d pta\n", euros + pesetas);
    
    System.out.println(""); //Salto de linea
    System.out.println("*****************************");
    System.out.println("*                           *");
    System.out.println("* Ticket de compra          *");
    System.out.println("*                           *");
    System.out.println("*****************************");
    System.out.println("*                           *");
    System.out.println("* Fecha: "+ dia + "/" + mes + "/" + año + "           *");
    System.out.println("*                           *");
    System.out.println("*****************************");
    System.out.println("*                           *");
    System.out.printf("* Base imponible %8.2f € *\n", baseImponible);
    System.out.println("*                           *");
    System.out.println("* IVA                " + iva + " % *");
    System.out.println("*                           *");
    System.out.printf("* IVA Producto   %8.2f € *\n", ivaProducto);
    System.out.println("*                           *");
    System.out.println("*****************************");
    System.out.println("*                           *");
    System.out.printf("* TOTAL %17.2f € *\n", total);
    System.out.printf("* PAGO  %17.2f € *\n", pago);
    System.out.printf("* CAMBIO %16.2f € *\n", cambio);
    System.out.println("*                           *");
    System.out.println("*****************************");
    System.out.println(""); //Salto de linea
    
    //Para poner el caracter % por pantalla hay que poner %%

    // Scanner sc = new Scanner(System.in);
    // double baseImponible;
    
    // System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    // baseImponible = sc.nextDouble();

    // System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
    // System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));   //Para imprimir el carácter %, lo debemos escapar utilizando %%
    // System.out.printf("-------------------------\n");
    // System.out.printf("Total          %8.2f €\n", (baseImponible * 1.21));

    // sc.close();
  }
  }
