/**
 * 
 * Propuestas por los ejercicios
 * -------------------------------
 * esCapicua
 * esPrimo
 * siguientePrimo
 * potencia
 * digitos
 * voltea
 * digitoN
 * posicionDeDigito
 * quitaPorDetras
 * quitaPorDelante
 * pegaPorDetras
 * pegaPorDelante
 * trozoDeNumero
 * juntaNumeros
 * 
 * Extras
 * -------------------------------
 * sumaDivisoresPropios   --> ejemplos/matematica/Varios
 * factorial
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package funciones;

public class numeros {

  /**
   * Voltear un numero introducido por teclado
   * 
   * @param x un numero de tipo long
   * @return long el numero volteado
   */

  public static long voltea(long x) {
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
   * Voltear un numero introducido por teclado, llamado a la funcion original que
   * devuelve un long
   * 
   * @param x un numero entero
   * @return int casteando el resultado de llamar a la funcion long voltea()
   */

  public static int voltea(int x) {
    return (int) voltea((long) x);
  }

  /**
   * Saber si un numero long es capicuo
   * 
   * @param x long
   * @return boolean
   */

  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  /**
   * Saber si un numero int es capicuo
   * 
   * @param x int
   * @return boolean
   */

  public static boolean esCapicua(int x) {
    return esCapicua((long) x);
  }

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x int un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code>
   *         en caso contrario
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
   * Devuelve el menor primo que es mayor al número que
   * se pasa como parámetro.
   * 
   * (Nos da el siguiente primo despues del numero introducido)
   * 
   * @param x int
   * @return int
   */

  public static int siguientePrimo(int x) {
    do {
      x++;
    } while (!esPrimo(x));
    return x;
  }

  /**
   * Dada una base y un exponente devuelve la potencia.
   * 
   * @param x double es la base
   * @param y double es el exponente
   * @return double
   */
  public static double potencia(double x, double y) {
    if (x == 0) {
      return 1;
    } else {
      double potencia = Math.pow(x, y);
      return potencia;
    }

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
   * Devuelve el número de dígitos que contiene un long
   * 
   * @param x long
   * @return int la cantidad de dígitos que contiene el número
   */

  public static int digitos(long x) {
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
   * Devuelve el dígito que está en la posición n de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param x int numero introducido
   * @param y int posicion del digito que quieres
   * @return int
   */

  public static int digitoN(int x, int y) {
    int numeroVolteado = voltea(x);
    int digito = 0;
    for (int i = 1; i <= y; i++) {
      digito = numeroVolteado % 10;
      numeroVolteado /= 10;
    }
    return digito;
  }

  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero.
   * Si no se encuentra, devuelve -1.
   * 
   * @param x long numero
   * @param y int digito que se busca
   * @return int
   */

  public static int posicionDeDigito(long x, int y) {
    long d = 0;
    x = voltea(x);
    int j = -1; // copia de i
    for (int i = 1; i <= digitos(x); i++) {
      d = x % 10;
      x /= 10;
      if (d == y) {
        j = i;
      }
    }
    return j;
  }

  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero.
   * Si no se encuentra, devuelve -1.
   * 
   * @param x int numero
   * @param y int digito que se busca
   * @return int
   */
  public static int posicionDeDigito(int x, int y) {
    return posicionDeDigito((long) x, y);
  }

  /**
   * Le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param x long numero
   * @param y int digitos que se quitan detras
   * @return long
   */

  public static long quitaPorDetras(long x, int y) {
    // x = voltea(x);
    // long d = 0;
    // long n = 0;
    // for (int i = 1; i <= digitos(x) - y; i++) {
    // d = x % 10;
    // x /= 10;
    // n = (n * 10) + d;
    // }
    // return n;
    return x / (long) potencia(10, y);
  }

  /**
   * Le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param x int numero
   * @param y int digitos que se quitan detras
   * @return int
   */

  public static int quitaPorDetras(int x, int y) {
    return (int) quitaPorDetras((long) x, y);
  }

  /**
   * Le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param x long numero
   * @param y int digitos que se quitan delante
   * @return long
   */

  public static long quitaPorDelante(long x, int y) {
    x = voltea(x);
    x = x / (long) potencia(10, y);
    return voltea(x);
  }

  /**
   * Le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param x int numero
   * @param y int digitos que se quitan delante
   * @return int
   */
  public static int quitaPorDelante(int x, int y) {
    return (int) quitaPorDelante((long) x, y);
  }

  /**
   * Añade un dígito a un número por detrás.
   * 
   * @param x long numero inicial
   * @param y int digito introducido
   * @return long
   */

  public static long pegaPorDetras(long x, int y) {
    long numero = x * 10;
    numero += y;
    return numero;
  }

  /**
   * Añade un dígito a un número por detrás.
   * 
   * @param x int numero inicial
   * @param y int digito introducido
   * @return int
   */

  public static int pegaPorDetras(int x, int y) {
    int numero = x * 10;
    numero += y;
    return numero;
  }

  /**
   * Añade un dígito a un número por delante.
   * 
   * @param x long numero inicial
   * @param y int digito introducido
   * @return long
   */

  public static long pegaPorDelante(long x, int y) {
    int digitos = digitos(x);
    for (int i = 0; i < digitos; i++) {
      y *= 10;
    }
    return (y + x);
  }

  /**
   * Añade un dígito a un número por delante.
   * 
   * @param x int numero inicial
   * @param y int digito introducido
   * @return int
   */

  public static int pegaPorDelante(int x, int y) {
    int digitos = digitos(x);
    for (int i = 0; i < digitos; i++) {
      y *= 10;
    }
    return (y + x);
  }

  /**
   * Toma como parámetros las posiciones inicial y finaldentro de un número y
   * devuelve el trozo correspondiente.
   * 
   * sin terminar y mal
   * 
   * @param x long numero original
   * @param y int Modo: (1 PARA LA PRIMERA PARTE) (2 PARA LA PARTE FINAL)
   * @return long
   */

  public static long trozoDeNumero(long x, int y) {
    long numero = x;
    long resultado = 0;
    if (y == 1) {
      numero = voltea(x);
    }
    for (int i = 1; i <= digitos(x) / 2; i++) {
      resultado = (numero % 10) * 10;
      numero /= 10;
    }
    return resultado;
  }

  /**
   * Pega dos números para formar uno.
   * 
   * @param x long primer numero
   * @param y long segundo numero
   * @return long
   */

  public static long juntaNumeros(long x, long y) {
    for (int i = 0; i < digitos(y); i++) {
      x *= 10;
    }
    return x + y;
  }

  /**
   * Pega dos números para formar uno.
   * 
   * @param x int primer numero
   * @param y int segundo numero
   * @return int
   */

  public static int juntaNumeros(int x, int y) {
    for (int i = 0; i < digitos(y); i++) {
      x *= 10;
    }
    return x + y;
  }

  /**
   * Suma de divisores propios
   * 
   * @param x int
   * @return int
   */

  public static int sumaDivisoresPropios(int x) {
    int suma = 0;
    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        suma += i;
      }
    }
    return suma;
  }

  /** 
   * Sacar el factorial de un numero 
   * 
   * Ejemplo 6! = 720
   * 
   * @param x int 
   * @return int
   */

  public static int factorial(int x) {
    int f = 1;
    for (int i = 1; i <= x; i ++){
      f *= i;
    }  
    return f;
  }

}
