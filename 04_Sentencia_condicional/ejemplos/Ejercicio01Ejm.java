import java.util.Scanner;

/**
 * Ejercicio 1 Ejemplo: Escribe un programa que solicite por teclado la edad del usuario y muestre por pantalla si es menor, 
 * mayor de edad o si esta jubilado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Ejercicio01Ejm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("¿Cuantos años tienes?: ");
    int edad = sc.nextInt();
    sc.close(); 

    if (edad < 0) {
      System.out.println("Intoduce un numero positivo.");
    }else{
      if (edad < 18) {
        System.out.println("Eres menor de edad");
      }else{
        if (edad >= 65) {
          System.out.println("Estas jubilado");
        }else{
          System.out.println("Eres mayor de edad");
        }
      }
    }

  }
}