/**
 * Explica tu codigo aqui
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;

import matematicas.Varias;
import matematicas.Volumen;

/**
 * PruebasFunciones
 */
public class PruebasFunciones {

  public static void main(String[] args) {

    int n;
    
    // Prueba esPrimo(), llamando a la función esPrimo alojada en la clase Varias dentro del paquete matematicas
    
    System.out.print("Introduzca un número entero positivo: ");
    n = Integer.parseInt(System.console().readLine());
    
    if (Varias.esPrimo(n)) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }


    // Prueba digitos(int x), llamando a la función digitos alojada en la clase Varias dentro del paquete matematicas

    System.out.print("Introduzca un número entero positivo: ");
    n = Integer.parseInt(System.console().readLine());

    System.out.println(n + " tiene " + Varias.digitos(n) + " dígitos.");

    // Prueba volumenCilindro(double r, double h), llamando a la función esPrimo alojada 
    // en la clase Varias dentro del paquete matematicas

    double r, h;

    System.out.println("Cálculo del volumen de un cilindro");
    System.out.print("Introduzca el radio en metros: ");
    r = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura en metros: ");
    h = Double.parseDouble(System.console().readLine());

    System.out.println("El volumen del cilindro es " + Volumen.volumenCilindro(r, h) + " m3");

    System.out.print("Introduzca un numero para voltearlo: ");
    long x = Long.parseLong(System.console().readLine());
    System.out.println("El numero " + x + " volteado es: " + Varias.voltea(x));

    //Prubea de la funcion int voltea()
    System.out.print("Introduzca un numero para voltearlo: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("El numero " + num + " volteado es: " + Varias.voltea(num));

    System.out.print("Introduzca un numero para saner si es capicua (long): ");
    x = Long.parseLong(System.console().readLine());
    if (Varias.esCapicua(x)) {
      System.out.println("El numero es capicua");
    } else {
      System.out.println("El numero no es capicua.");
    }

    System.out.print("Introduzca un numero para saner si es capicua (long): ");
    x = Integer.parseInt(System.console().readLine());
    if (Varias.esCapicua(x)) {
      System.out.println("El numero es capicua");
    } else {
      System.out.println("El numero no es capicua.");
    }

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

    System.out.print("Introduce un numero para conocer el siguiente primo: ");
    int z = sc.nextInt();

    System.out.println("El siguiente primo a " + z + " es " + Varias.siguientePrimo(z));

    sc.close(); //Cierre del Scanner 
  }
}