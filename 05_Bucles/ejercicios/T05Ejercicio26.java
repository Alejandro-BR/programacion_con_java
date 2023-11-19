/**
 * Ejercicio 26: Realiza un programa que pida un numero y a continuacion un digito. El programa nos debe dar la posicion
 * (o posiciones) contando de izquierda a derecha que ocupa ese digito en el numero introducido.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner;
public class T05Ejercicio26 {
  public static void main(String[] args) {
    int primerNumero;
    int segundoNumero;
    int tercerNumero;
    int ultimoNumero;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("El numero por pantalla lo pone al reves");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero (maximo cuatro digitos): ");
    int numero = sc.nextInt();
    System.out.print("Introduce el digito que quieres buscar dentro del numero anterior: ");
    int digitoBuscado = sc.nextInt();
    System.out.println(""); //SALTO DE LINEA
    sc.close(); //Cierre del Scanner
    
    if (numero < 10){  //Numeros de una cifra
      
      if (digitoBuscado == numero) {
        System.out.println("El numero y el digito introducidos son el mismo.");
      } else {
        System.out.println("El digito que buscas no se encuentra dentro del numero dado");
      }

    } else if (numero < 100){  //Numeros de dos cifras
      
      primerNumero = numero / 10;
      ultimoNumero = numero % 10;
      
      if (digitoBuscado == primerNumero) {
        System.out.println("El digito buscado es igual al primer digito del numero introducido.");
      } else if (digitoBuscado == ultimoNumero) {
        System.out.println("El digito buscado es igual al ultimo digito del numero introducido.");
      } else  {
        System.out.println("El digito que buscas no se encuentra dentro del numero dado.");
      }
      
    } else if (numero < 1000){ //Numeros de tres cifras
      
      primerNumero = numero / 100;
      segundoNumero = (numero / 10) % 10;
      ultimoNumero = numero % 10;
      
      if (digitoBuscado == primerNumero) {
        System.out.println("El digito buscado es igual al primer digito del numero introducido.");
      } else if (digitoBuscado == ultimoNumero) {
        System.out.println("El digito buscado es igual al ultimo digito del numero introducido.");
      } else if (digitoBuscado == segundoNumero) {
        System.out.println("El digito buscado es igual al digito del medio del numero introducido.");
      } else  {
        System.out.println("El digito que buscas no se encuentra dentro del numero dado.");
      }
      
    } else if (numero < 10000) {
      
      primerNumero = numero / 1000;
      segundoNumero = (numero/100) % 10 ;
      tercerNumero = (numero % 100) / 10;
      ultimoNumero = numero % 10;

      if (digitoBuscado == primerNumero) {
        System.out.println("El digito buscado es igual al primer digito del numero introducido.");
      } else if (digitoBuscado == ultimoNumero) {
        System.out.println("El digito buscado es igual al ultimo digito del numero introducido.");
      } else if (digitoBuscado == segundoNumero) {
        System.out.println("El digito buscado es igual al segundo digito del numero introducido.");
      } else if (digitoBuscado == tercerNumero) {
        System.out.println("El digito buscado es igual al tercer digito del numero introducido.");
      }else  {
        System.out.println("El digito que buscas no se encuentra dentro del numero dado.");
      }
    }

    System.out.println(""); //SALTO DE LINEA 
  }
}
