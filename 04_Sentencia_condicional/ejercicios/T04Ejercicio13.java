/**
 * Ejercicio 13: Escribe un programa que ordene tres numeros enteros introducidos por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio13 {
  public static void main(String[] args) {

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("ORDENAR NUMEROS:");
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Este programa ordenara tres digitos introducidos por teclado");
    System.out.println("los cuales se ordenaran de mayor a menor. ");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc
    System.out.print("Introduce el primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Introduce el segundo numero: ");
    int num2 = sc.nextInt();
    System.out.print("Introduce el tercer numero: ");
    int num3 = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    boolean opcion1 = (num1 >= num2) && (num2 >= num3);
    boolean opcion2 = (num1 >= num3) && (num3 >= num2);

    boolean opcion3 = (num2 >= num1) && (num1 >= num3);
    boolean opcion4 = (num2 >= num3) && (num3 >= num1);

    boolean opcion5 = (num3 >= num1) && (num1 >= num2);
    boolean opcion6 = (num3 >= num2) && (num2 >= num1);

    System.out.println(""); //SALTO DE LINEA 

    if (opcion1) {
      System.out.println(num1 + "  " + num2 + "  " + num3);
    } else if (opcion2) {
      System.out.println(num1 + "  " + num3 + "  " + num2);
    } else if (opcion3) {
      System.out.println(num2 + "  " + num1 + "  " + num3);
    } else if (opcion4) {
      System.out.println(num2 + "  " + num3 + "  " + num1);
    } else if (opcion5){
      System.out.println(num3 + "  " + num1 + "  " + num2);
    } else if (opcion6){
      System.out.println(num3 + "  " + num2 + "  " + num1);
    }

    System.out.println(""); //SALTO DE LINEA
    
    //Ejercicio del profesor: (El mio funciona igual pero este modelo es mas eficiente)
    // // ordenación de los dos primeros números
    // if (num1 > num2) {
    //   int aux = num1;
    //   num1 = num2;
    //   num2 = aux;
    // }

    // // ordenación de los dos últimos números
    // if (num2 > num3) {
    //     int aux = num2;
    //     num2 = num3;
    //     num3 = aux;
    // }
    
    // // se vuelven a ordenar los dos primeros

    // if (num1 > num2) {
    //     int aux = num1;
    //     num1 = num2;
    //     num2 = aux;
    // }
    // System.out.println("Los números introducidos ordenados de menor a mayor son " + num1 + ", " + num2 + " y " + num3 + ".");

  }
}
