package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Alejandro Barrionuevo Rosado
 * 
 */
public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */

  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */

  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  /** 
   * Voltear un numero introducido por teclado
   * @param x un numero de tipo long
   * @return long el numero volteado
   */

  public static long voltea(long x){
    if (x < 0) {
      return -voltea(-x);
    }
    long numeroVolteado = 0;
    while (x > 0) {
      numeroVolteado = (numeroVolteado * 10) + (x % 10);
      x /= 10; 
    }
    return numeroVolteado;
  }

  /** 
   *  Voltear un numero introducido por teclado, llamado a la funcion original que devuelve un long
   * @param x un numero entero
   * @return int casteando el resultado de llamar a la funcion long voltea()
   */

  public static int voltea(int x){
    return (int) voltea((long) x);
  }

  /** 
   * Saber si un numero long es capicuo
   * @param x
   * @return boolean
   */

  public static boolean esCapicua(long x){
    // boolean resultado = false;
    // if (x == voltea(x)) {
    //   resultado = true;
    // }
    // return resultado;
    return x == voltea(x);
  }

    /** 
   * Saber si un numero long es capicuo
   * @param x
   * @return boolean
   */

  public static boolean esCapicua(int x){
    return esCapicua((long) x);
  }

  /** 
   * Nos da el siguiente primo despues del numero introducido
   * @param x
   * @return int
   */

  public static int siguientePrimo(int x){
    do {
      x++;
    } while (!esPrimo(x));
    return x;
  }
}
