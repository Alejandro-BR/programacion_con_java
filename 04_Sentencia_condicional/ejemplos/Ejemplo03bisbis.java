import java.util.Scanner;

/**
 * Escribe un programa que solicite por teclado el numero del dia de la semana (1- Lunes, ETC) 
 * y muestre por pantalla si el dia es lectivo o fin de semna. 
 * Si el numero introduciod pno se corresponde con ningun dia de la semna se mostrara un error
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Ejemplo03bisbis {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia;
    System.out.print("Introduce el dia de la semana: ");
    dia = sc.nextInt();

    switch (dia) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Es un dia entre semana");
        break;
      case 6:
      case 7: 
        System.out.println("Es fin de semana");
        break;
        
      default:
        System.out.println("ERROR NO COINCIDE");
        break;
    }
    sc.close(); 
  }
}