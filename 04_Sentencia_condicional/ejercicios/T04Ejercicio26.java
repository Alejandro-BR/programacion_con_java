/**
 * Ejercicio 26: Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 * jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 * 
 * Ejemplo 1:
 * 
 * Venta de entradas CineCampa
 * Número de entradas: 4
 * Día de la semana: martes
 * ¿Tiene tarjeta CineCampa? (s/n): n
 * Aquí tiene sus entradas. Gracias por su compra.
 * Entradas individuales 4
 * Precio por entrada individual 8.00 €
 * Total 32.00 €
 * Descuento 0.00 €
 * A pagar 32.00 €
 * 
 * Ejemplo 2:
 * 
 * Venta de entradas CineCampa
 * Número de entradas: 4
 * Día de la semana: viernes
 * ¿Tiene tarjeta CineCampa? (s/n): s
 * Aquí tiene sus entradas. Gracias por su compra.
 * Entradas individuales 4
 * Precio por entrada individual 8.00 €
 * Total 32.00 €
 * Descuento 3.20 €
 * A pagar 28.80 €
 * 
 * Ejemplo 3:
 * 
 * Venta de entradas CineCampa
 * Número de entradas: 4
 * Día de la semana: jueves
 * ¿Tiene tarjeta CineCampa? (s/n): n
 * Aquí tiene sus entradas. Gracias por su compra.
 * Entradas de parejas 2
 * Precio por entrada de pareja 11.00 €
 * Total 22.00 €
 * Descuento 0.00 €
 * A pagar 22.00 €
 * 
 * Ejemplo 4:
 * 
 * Venta de entradas CineCampa
 * Número de entradas: 5
 * Día de la semana: jueves
 * ¿Tiene tarjeta CineCampa? (s/n): s
 * Aquí tiene sus entradas. Gracias por su compra.
 * Entradas parejas 2
 * Precio por entrada de pareja 11.00 €
 * Entradas individuales 1
 * Precio por entrada individual 8.00 €
 * Total 30.00 €
 * Descuento 3.00 €
 * A pagar 27.00 €
 * 
 * Ejemplo 5:
 * 
 * Venta de entradas CineCampa
 * Número de entradas: 5
 * Día de la semana: miercoles
 * ¿Tiene tarjeta CineCampa? (s/n): s
 * Aquí tiene sus entradas. Gracias por su compra.
 * Entradas individuales 5
 * Precio por entrada individual 5.00 €
 * Total 25.00 €
 * Descuento 2.50 €
 * A pagar 22.50 €
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio26 {
  public static void main(String[] args) {
    String dia;
    String tarjeta;
    double precioEntrada = 8;
    double descuento;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Venta de entradas CineCampa");

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Numero de entradas: ");
    int entradas = sc.nextInt();
    System.out.print("Dia de la semana: ");
    dia = sc.next();
    System.out.print("¿Tine tarjeta CineCampa? (s/n): ");
    tarjeta = sc.next();
    sc.close(); //Cierre del Scanner 

    switch (dia) {
      case "lunes":
      case "martes":
      case "viernes":
      case "sabado":
      case "domingo":
        precioEntrada = 8;
        break;
      case "miercoles":
        precioEntrada = 5;
        break;
      case "jueves":
          precioEntrada = 5.5;
        break;
      default:
        System.out.println("No introduciste un dia valido");
        break;
    }

    if (tarjeta.equals("s")) {
      descuento = 0.10;
    } else {
      descuento = 0;
    }

    double total = precioEntrada * entradas;
    double descuentoApli = total * descuento;
    double pagar = total - descuentoApli;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Aqui tienes sus entradas. Gracias por su compra.");

    if ((dia.equals("jueves")) && (entradas % 2 == 0)) {

      System.out.printf("%-29s %2d\n","Entradas de parejas",entradas); 
      System.out.printf("%-29s %5.2f €\n","Precio por entrada de pareja",(precioEntrada * 2));

    } else if ((dia.equals("jueves")) && (entradas % 2 != 0)) {

      int entradasJ = entradas % 2;
      System.out.printf("%-29s %2d\n","Entradas de parejas",(entradas - entradasJ)); 
      System.out.printf("%-29s %5.2f €\n","Precio por entrada de pareja",(precioEntrada * 2));
      System.out.printf("%-29s %2d\n","Entradas individuales",entradasJ); 
      System.out.printf("%-29s %5.2f €\n","Precio por entrada individual",8.00);
      
      total = (precioEntrada * (entradas - entradasJ)) + (8 * entradasJ);
      descuentoApli = total * descuento;
      pagar = total - descuentoApli;

    } else {

      System.out.printf("%-29s %2d\n","Entradas individuales",entradas); 
      System.out.printf("%-29s %5.2f €\n","Precio por entrada individual",precioEntrada); 

    }

    System.out.printf("%-28s %6.2f €\n","Total",total); 
    System.out.printf("%-28s %6.2f €\n","Descuento",descuentoApli);
    System.out.printf("%-28s %6.2f €\n","A pagar",pagar);

    System.out.println(""); //SALTO DE LINEA 

  }
}
