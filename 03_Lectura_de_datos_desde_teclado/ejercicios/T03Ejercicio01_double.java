import java.util.Scanner; //Importar Scanner
//import java.util.Locale;  //Importar para poder usar decimales
/**
 * Ejercicio 1: Realiza un programa que pida dos numero y que luego muestre el resultado de su multiplicación.
 * VERSION 2 CON DOUBLE
 * 
 * @author Alejandro Barrionuevo Rosado
 */

/**
 *  Me da error al ejecutarlo y poner un numero decimal.
 */

public class T03Ejercicio01_double {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("******************************************************************************************");
    System.out.println("                        Calculadora de multiplicaciones");
    System.out.println("******************************************************************************************");
    System.out.println(""); //SALTO DE LINEA
    System.out.println("Introduce por pantalla los dos numeros que quieras multiplicar entre si.");
    System.out.println("(Numeros enteros)");
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in); //Creamos un objetos de la clase Scanner, llamado sc

    System.out.print("PRIMER NUMERO: ");
    double num1 = sc.nextDouble();
    System.out.print("SEGUNDO NUMERO: ");
    double num2 = sc.nextDouble();

    double resultado = num1 * num2;
    sc.close(); //Cierre del Scanner; 

    //System.out.println("El resultado de multiplicar el numero " + num1 + " con el numero " + num2 + " sale --> " + resultado);
    System.out.print("RESULTADO --> ");
    System.out.println(num1 + " x " + num2 + " = " + resultado);
    System.out.println(""); //SALTO DE LINEA
  }
}
