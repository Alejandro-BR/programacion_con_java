/**
 * Ejemplo de bucle While
 * Contador de numeros positivos introducidos por teclado
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class EjemploWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");  //Creamos un objetos de la clase Scanner, llamado sc (Permite tildes)
    //Si le pones Windows-1252 se puede poner tildes (Esto no es necesario para este ejercicio pero es un dato util)
    int numeroIntroducido = 0; //Variable que controla la salida del bucle
    int cuentaNumeros = 0; //Variables acumuladora de numeros positivos introducidos
    int suma = 0;         //Variable acumuladora de los numeros positivos introducidos

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Por favor, introduce numeros enteros positivos.");
    System.out.println("El programa finalizara cuando se introduzca un numero negativo.");

    while (numeroIntroducido >= 0) {
      System.out.print("Número: ");
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {
        cuentaNumeros++;
        suma += numeroIntroducido;  //suma = suma + numeroIntroducido
      }
    }

    sc.close(); //Cierre del Scanner 
    
    System.out.println("La cantidad de numeros positivos introducidos es " + cuentaNumeros);
    System.out.println("La suma total de ellos es " + (suma));
    System.out.println(""); //SALTO DE LINEA 

  }
}
