/**
 * Ejercicio 3 examen: Realiza un programa que nos pedirá un número real de doble precisión, un signo aritmético en forma de carácter y por último, otro número real de doble precisión. Según el valor que haya introducido se realizará la operación correspondiente. Al final mostrará el resultado por pantalla, bajo las siguientes condiciones:
 *
 * La instrucción de mostrar por pantalla el resultado debe aparecer una sola vez en tu código.
 * Aunque el usuario introduzca número con varios decimales, en el mensaje de salida solo deben aparecer 2 dígitos. 
 * Los signos aritméticos disponibles son:
 *
 * +: suma los dos operandos.
 *
 * -: resta los operandos.
 *
 * *: multiplica los operandos.
 *
 * /: divide los operandos, este debe dar un resultado con decimales.
 *
 * ^:  la operación potencia, donde el primer número actuará como base y el segundo número como exponente.
 *
 * %:  resto de la división entre el primer número y el segundo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class EjercicioExamen03 {
  public static void main(String[] args) {
    String operando = " ";
    double operacion = 0;
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Escribe el primer operando: ");
    double num1 = sc.nextInt();
    System.out.print("Escribe el codigo de operacion (+,-,*,/,^,%): ");
    operando = sc.next();
    System.out.print("Escribe el segundo operando: ");
    double num2 = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    switch (operando) {
      case "+":
        operacion = num1 + num2;
        break;
      case "-":
        operacion = num1 - num2;
        break;
      case "*":
        operacion = num1 * num2;
        break;
      case "/":
        operacion = num1 / num2;
        break;
      case "^":
        operacion = Math.pow( num1, num2);
        break;
      case "%":
        operacion = num1 % num2;
        break;
      default:
        System.out.println("No introduciste un operador correcto.");
        break;
    }

    System.out.printf("%5.2f %1s %5.2f = %5.2f",num1,operando,num2,operacion);
    System.out.println(""); //SALTO DE LINEA 
  }
}
