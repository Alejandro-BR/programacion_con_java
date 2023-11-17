/**
 * Ejercicio 15: Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 21, 22, 23, 24 y 25.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio15 {
  public static void main(String[] args) {

    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc
    System.out.print("Introduce la base: ");
    int base = sc.nextInt();
    System.out.print("Introduce el exponente: ");
    int exponente = sc.nextInt();
    sc.close(); //Cierre del Scanner
    
    double potencia = 0;

    for (int i = exponente; i >= 1; i--){
      //double potencia = Math.pow(base, i);
      for (int j = 0; j < exponente; j++){
        potencia = base * i;
      }
      System.out.printf("%-2d con exponente %-2d =  %-2.0f \n",base, i, potencia); 
    }

    System.out.println(""); //SALTO DE LINEA

  }
}
