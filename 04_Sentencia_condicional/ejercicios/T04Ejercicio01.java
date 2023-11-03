/**
 * Ejercicio 1: Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio01 {
  public static void main(String[] args) {

    System.out.println(""); //SALTO DE LINEA
    System.out.println("SI PONES EL DIA DE LA SEMANA TE DA LA PRIMERA ASIGNATURA QUE TE TOCA ESE DIA");
    System.out.println(""); //SALTO DE LINEA
    System.out.printf("Lunes %5d \n", 1);
    System.out.printf("Martes %4d \n", 2);
    System.out.printf("Miercoles %1d \n", 4);
    System.out.printf("Jueves %4d \n", 3);
    System.out.printf("Viernes %3d \n", 5);
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el dia de la semana: ");
    int dia = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 

    switch (dia) {
      case 1:
        System.out.println("Formacion y orientacion laboral");
        break;
      case 2, 5:
        System.out.println("Programacion");
        break;
      case 3:
        System.out.println("Entornos de desarrollo");
        break;
      case 4:
        System.out.println("Bases de datos");
        break;
      default:
        System.out.println("Introduce un numero valido es decir del 1 al 5.");
    }

    System.out.println(""); //SALTO DE LINEA 

  }
}
