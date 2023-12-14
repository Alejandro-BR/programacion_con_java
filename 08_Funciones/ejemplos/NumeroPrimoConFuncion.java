/**
 * Explica tu codigo aqui
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class NumeroPrimoConFuncion {

  /*
   * Comprueba si un numero entero positivo es primo o no.
   * 
   */
  ////Funciones definidad por el usuario
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Introduce un numero entero positivo: ");
    int n = Integer.parseInt(System.console().readLine() );

    if (esPrimo(n)) {
      System.out.println("El numero " + n + "es primo.");
    } else {
      System.out.println("El numero " + n + "no es primo.");
    }
  }
  
}
