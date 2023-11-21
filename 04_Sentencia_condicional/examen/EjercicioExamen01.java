/**
 * Ejercicio 1 examen: Realiza un programa para gestionar el ticket de compra de un supermercado. 
 *
 * El usuario deberá escoger el número de opción de un menú que se muestre por pantalla, escribir el nombre del producto, el número de unidades y el precio por unidad teniendo en cuenta las siguientes condiciones: 
 *
 * 1. Alimentación:
 *
 * Huevos (4% IVA)
 * Pan (4% IVA)
 * Leche (4% IVA)
 * Fruta (4% IVA)
 * Carne (10% IVA)
 * Agua (10% IVA)
 * Verdura (4% IVA)
 * Otros (10% IVA)
 * 2. Farmacia (4% IVA)
 * 3. Electrónica (21% IVA)
 * 4. Moda (21% IVA)
 *
 * Además, antes de mostrar el ticket por pantalla, se preguntará al usuario si dispone de algún código promocional para introducirlo por pantalla:
 *
 * "SINIVA": Descontará el IVA. Sólo aplicable en artículos de alimentación. 
 * "PROMO50": Realizará un descuento del 50%. Sólo aplicable en los artículos de electrónica.
 * "PROMO3X2": El usuario se llevará 3 artículos y paga 2. Sólo aplicable a artículos de moda.
 * "NO" : El usuario no dispone de un código promocional y no aparecerá la línea de descuento en el ticket.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class EjercicioExamen01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc
    int opcionAlimento;
    double iva = 0.04;
    String ivaTexto = "4%";
    String nombreProducto;
    String codigoPromo;
    double descuento = 0;
    double precioIva; 

    System.out.println(""); //SALTO DE LINEA
    System.out.println("Introduzca el tipo de producto:");
    System.out.println("1. Alimentacion");
    System.out.println("2. Farmacia");
    System.out.println("3. Electronica");
    System.out.println("4. Moda");
    System.out.print("Opcion: ");
    int opcionGeneral = sc.nextInt();

    switch (opcionGeneral) {
      case 1: //ALIMENTOS
        System.out.println("Introduzca el tipo de alimento:");
        System.out.println("1. Huevo");
        System.out.println("2. Pan");
        System.out.println("3. Leche");
        System.out.println("4. Fruta");
        System.out.println("5. Carne");
        System.out.println("6. Agua");
        System.out.println("7. Verdura");
        System.out.println("8. Otros");
        System.out.print("Opcion: ");
        opcionAlimento = sc.nextInt();
        switch (opcionAlimento) { //IVA DE LOS ALIMENTOS
          case 1 , 2, 3, 4, 7:
            iva = 0.04;
            ivaTexto = "4%";
            break;
          case 5, 6, 8:
            iva = 0.10;
            ivaTexto = "10%";
            break;
          default:
            System.out.println("No introduciste un alimento.");
            break;
        }
        break;
      case 2: // FARMACIA
        iva = 0.04;
        ivaTexto = "4%";
        break;
      case 3: //Electronica
      case 4: //MODA
        iva = 0.21;
        ivaTexto = "21%";
        break;
      default:
        System.out.println("No introduciste un producto.");
        break;
    }
    
    System.out.print("Introduzca el nombre del producto: ");
    nombreProducto = sc.next();
    System.out.print("Introduzca la cantidad de productos: ");
    int cantidad = sc.nextInt();
    System.out.print("Introduzca el precio por unidad de producto: ");
    double precio = sc.nextDouble();
    System.out.print("Introduzca codigo promocional: ");
    codigoPromo = sc.next();
    System.out.println(""); //SALTO DE LINEA 
    sc.close(); //Cierre del Scanner
    
    // "SINIVA": Descontará el IVA. Sólo aplicable en artículos de alimentación. 
    // "PROMO50": Realizará un descuento del 50%. Sólo aplicable en los artículos de electrónica.
    // "PROMO3X2": El usuario se llevará 3 artículos y paga 2. Sólo aplicable a artículos de moda.
    // "NO" : El usuario no dispone de un código promocional y no aparecerá la línea de descuento en el ticket.

    double total = precio * cantidad; 

    System.out.println("Factura");
    System.out.println("---------------------------------");
    System.out.printf("Articulo %24s \n",nombreProducto); 
    System.out.printf("Precio %17.2f €/unidad \n",precio); 
    System.out.printf("Cantidad %24d \n",cantidad); 
    System.out.printf("Total %25.2f € \n",total); 
    precioIva = 0;

    switch (codigoPromo) {
      case "SINIVA":
        precioIva = total * iva;
        descuento = precioIva;
        precioIva = (total - descuento) * iva;
        System.out.printf("Descuento (SIN IVA) %6s %6.2f € \n","-",descuento); 
        break;
      case "PROMO50":
        descuento = total / 2;
        precioIva = (total - descuento) * iva;
        System.out.printf("Descuento (Mitad) %6s %6.2f € \n","-",descuento); 
        break;
      case "PROMO3X2":
        precioIva = total * iva;
        if (opcionGeneral == 3) {
          descuento = precioIva - (precioIva / 3);
          System.out.printf("Descuento (3*2) %6s %6.2f € \n","-",descuento); 
        } else {
          descuento = 0;
        }
        break;
      case "NO":
        descuento = 0;
        precioIva = (total - descuento) * iva;
        break;
    }

    
    double totalConIva = total + precioIva;

    System.out.printf("IVA al %3s %20.2f € \n",ivaTexto, precioIva); 
    System.out.println("---------------------------------");
    System.out.printf("Total con IVA %17.2f € \n",totalConIva); 
    
    System.out.println(""); //SALTO DE LINEA 
    
  }
}