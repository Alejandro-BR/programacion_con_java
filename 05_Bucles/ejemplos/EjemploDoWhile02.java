/**
 * Ejemplo de bucle de do-While 2
 * Programa que lee numeros de teclado mientras el numero introducido sea par
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class EjemploDoWhile02 {
  public static void main(String[] args) {
    int numero = 0;
    do {
      System.out.print("Introduce un numero par: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero % 2 == 0) {
        System.out.println("Ay qué bonito es el número par " + numero);
      } else {
        System.out.println("No me gustan los impares. Adiós");
      }
    } while (numero % 2 == 0);
  }
}
