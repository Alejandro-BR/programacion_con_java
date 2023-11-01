/**
 * Ejercicio 4: Escribe un programa que sume, reste, multiplique y dividad dos numeros introduciodos por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T03Ejercicio04 {
  public static void main(String[] args) {

    //Variables aritmeticas:
    double suma;
    double multiplicacion;
    double resta;
    double division;

    System.out.println(""); //SALTO DE PAGINA
    System.out.println("SUMA RESTA MULTIPLICACION Y DIVISION DE LOS DOS SIGUIENTE NUMEROS");
    System.out.println(""); //SALTO DE PAGINA

    Scanner sc = new Scanner(System.in); //Scanner 
    //primer numero:
    System.out.print("Introduce el primer numero: ");
    double num1 = sc.nextDouble(); 
    //segundo numero:
    System.out.print("Introduce el primer numero: ");
    double num2 = sc.nextDouble();
    sc.close(); //Cierre del Scanner 
    System.out.println(""); //SALTO DE PAGINA 

    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = num1 / num2;

    System.out.println(num1 + " + " + num2 + " = " + suma);
    System.out.println(num1 + " - " + num2 + " = " + resta);
    System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
    System.out.println(num1 + " / " + num2 + " = " + division);

    System.out.println(""); //SALTO DE PAGINA 
  }
}
