import java.util.Scanner; //Importar Scanner
/**
 * Ejercicio 1: Realiza un programa que pida dos numero y que luego muestre el resultado de su multiplicación.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

/**
 *  Intente de primera hora hacerlo con double pero me daba error al ponerlo por teclado,
 *  por lo que cambie el codigo a int pondre esa version con double aparte para mirarlo en clase.
 */

public class T03Ejercicio01 {
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
    int num1 = sc.nextInt();
    System.out.print("SEGUNDO NUMERO: ");
    int num2 = sc.nextInt();

    int resultado = num1 * num2;
    sc.close(); //Cierre del Scanner; 

    //System.out.println("El resultado de multiplicar el numero " + num1 + " con el numero " + num2 + " sale --> " + resultado);
    System.out.print("RESULTADO --> ");
    System.out.println(num1 + " x " + num2 + " = " + resultado);
    System.out.println(""); //SALTO DE LINEA
  }
}
