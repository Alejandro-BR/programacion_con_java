/**
 * Ejercicio 25: Realiza un programa que pida un numero por teclado y que luego muestre ese numero al reves.
 * 
 * Conseguido pero solo hasta cuatro digitos y sin utilizar ningun tipo de bucle  "preguntar en clase"
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio25 {
  public static void main(String[] args) {
    int primerNumero;
    int numeroMedio;
    int ultimoNumero;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("El numero por pantalla lo pone al reves");
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el numero: ");
    int numero = sc.nextInt();
    System.out.println(""); //SALTO DE LINEA
    sc.close(); //Cierre del Scanner
    
    if (numero < 10){
      
      System.out.println(numero);
      
    } else if (numero < 100){
      
      primerNumero = numero / 10;
      ultimoNumero = numero % 10;
      
      System.out.println("Invertido: " + ultimoNumero + primerNumero);
      
    } else if (numero < 1000){
      
      primerNumero = numero / 100;
      numeroMedio = (numero / 10) % 10;
      ultimoNumero = numero % 10;
      
      System.out.println("Invertido: " + ultimoNumero + numeroMedio + primerNumero);
      
    } else if (numero < 10000) {
      
      primerNumero = numero / 1000;
      numeroMedio = (numero/100) % 10 ;
      int nuemeroMedio2 = (numero % 100) / 10;
      ultimoNumero = numero % 10;

      System.out.println("Invertido: " + ultimoNumero + nuemeroMedio2 + numeroMedio + primerNumero);
    }

    System.out.println(""); //SALTO DE LINEA 
  }
}
