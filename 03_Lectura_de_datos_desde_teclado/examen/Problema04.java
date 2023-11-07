/**
 * Problema 4: La franquicia de tiendas de ropa VísteT nos ha pedido que realicemos un programa para su terminal de punto de venta. 
 * El programa deberá solicitar el nombre del artículo a vender, 
 * su precio base en euros (sin IVA) y la cantidad de unidades que se desean.
 * Al estar en periodo de rebajas, se aplica un descuento del 15 % sobre el precio base. Con estos datos, 
 * el programa mostrará por pantalla el total de la compra, aplicándole el 21% de IVA. 
 * Toda la información deberá presentarse en pantalla tal y como ves en el ejemplo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class Problema04 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el articulo: ");
    String articulo = sc.nextLine();
    System.out.print("Introduce el precio: ");
    double precio = sc.nextDouble();
    System.out.print("Introduce la cantidades: ");
    int cantidad = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 

    System.out.println("Factura");
    System.out.println("==========================");
    
    //CALCULOS Y VARIABLES
    double subTotal = precio * cantidad;
    double descuento = subTotal * 0.15; 
    double subTotalD = subTotal - descuento;
    double iva = subTotalD * 0.21;
    double total = subTotalD + iva;

    System.out.printf("Articulo%18s \n", articulo); 
    System.out.printf("Precio%11.2f €/unidad \n", precio);
    System.out.printf("Cantidad%18s \n", cantidad);
    System.out.printf("Subtotal%16.2f €\n", subTotal);
    System.out.printf("Descuento (15%%)%9.2f €\n",descuento);
    System.out.printf("Subtotal - Desct%8.2f €\n", subTotalD);
    System.out.printf("IVA (21%%)%15.2f €\n", iva);

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("==========================");
    System.out.printf("\033[48;5;8mTOTAL %18.2f €\033[0m \n", total);
    System.out.println(""); //SALTO DE LINEA 
  }
}
