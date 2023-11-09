/**
 * Ejercicio 20: Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T04Ejercicio20 {
  public static void main(String[] args) {
    int n;
    boolean capicua = false;

    System.out.println("Introduce un numero (5 cifras como maximo) para saber si es capicua: ");
    n = Integer.parseInt(System.console().readLine());

    //Numeros de 1 cifra
    if (n < 10) {
      capicua = true;
    }

    //Numeros de 2 cifras
    if ((n >= 10) && (n<100)) {
      if ((n/10) == (n % 10)) {
        capicua = true;
      }
    }

    //Numeros de 3 cifras
    if ((n >= 100) && (n<1000)) {
      if ((n/100) == (n % 10)) {
        capicua = true;
      }
    }

    //Numeros de 4 cifras
    //1 cifra = 4 cifra
    //2 cifra = 3 cifra
    if ((n >= 1000) && (n<10000)) {
      if (((n/1000) == (n % 10)) && (((n/100)%10) == ((n % 100)/10))) {
        capicua = true;
      }
    }

    if ((n >= 10000) && (n<100000)) {
      if (((n/10000) == (n % 10)) && (((n/1000)%10) == ((n / 10)%10))) {
      capicua = true;
      }
    }

    //capicua == true --> capicua
    if (capicua) {
      System.out.println("El numero " + n + " es capicua");
    } else {
      System.out.println("El numero " + n + " no es capicua");
    }
  }
}
