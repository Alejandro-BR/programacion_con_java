/**
 * Ejemplo 1:
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class NumeroPrimos {
  public static void main(String[] args) {
    System.out.println("Introduce un numero entero positivo: ");
    int n = Integer.parseInt(System.console().readLine());
    boolean esPrimo = true;

    for (int i = 0; i < n; i++) {
      if ((n % i) == 0) {
        esPrimo = false;
      }
    }

    if (esPrimo) {
      System.out.println("El numero " + n + " es primo.");

    } else {
      System.out.println("El numero " + n + "no es primo.");
    }
  } 
}
