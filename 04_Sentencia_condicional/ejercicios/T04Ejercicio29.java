/**
 * Ejercicip 29: Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 * 
 * Ejemplo 1:
 * 
 * ¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
 * ¿Qué ha tomado de beber? (zumo o café): café
 * Palmera: 1,40 €
 * Café: 1,20 €
 * Total desayuno: 2,60 €
 *
 * Ejemplo 2:
 * 
 * ¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
 * ¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
 * ¿Qué ha tomado de beber? (zumo o café): zumo
 * Pitufo con tortilla: 1,60 €
 * Zumo: 1,50 €
 * Total desayuno: 3,10 €
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio29 {
  public static void main(String[] args) {
    String comer;
    String beber;
    String pitufo = "";
    double precioBebida = 0;
    double precioComida = 0;

    System.out.println(""); //SALTO DE LINEA 
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    comer = sc.next();
    if (comer.equals("pitufo")) {
      System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla):");
      pitufo = sc.next();
    }
    System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
    beber = sc.next();
    sc.close(); //Cierre del Scanner 

    switch (beber) {
      case "zumo":
        precioBebida = 1.50;
        break;
      case "cafe":
        precioBebida = 1.30;
        break;
      default:
        System.out.println("No introduciste una bebida");
        break;
    }

    switch (comer) {
      case "donut":
        precioComida = 1;
        break;
      case "palmera":
        precioComida = 1.40;
        break;
      case "pitufo":
        if (pitufo.equals("aceite")) {
          precioComida = 1.20;
        } else if (pitufo.equals("tortilla")){
          precioComida = 1.60;
        }
        break;
      default:
        System.out.println("No introduciste una comida");
        break;
    }

    System.out.println(""); //SALTO DE LINEA 
    if (comer.equals("pitufo")) {
      System.out.printf("%-5s con %5s: %4.2f€\n",comer,pitufo,precioComida); 
    } else {
      System.out.printf("%-5s: %4.2f€\n",comer,precioComida); 
    }
    System.out.printf("%-4s: %4.2f€\n",beber,precioBebida);
    System.out.printf("Total desayuno: %4.2f€\n",(precioBebida + precioComida));
    System.out.println(""); //SALTO DE LINEA 
  }
}
