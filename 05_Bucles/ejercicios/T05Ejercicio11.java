/**
 * Ejercicio 11: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio11 {
  public static void main(String[] args) {
    double cuadrado;
    double cubo;
    System.out.println(""); //SALTO DE LINEA
    System.out.println("Muestra en tres columnas, el cuadrado y el cubo");
    System.out.println("De los 5 primeros números enteros a partir de uno que se introduce por teclado"); 
    System.out.println(""); //SALTO DE LINEA
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc
    System.out.print("Introduce el numero: ");
    int numeroIntroducido = sc.nextInt();
    sc.close(); //Cierre del Scanner

    System.out.println(""); //SALTO DE LINEA 
    
    for(int i = numeroIntroducido + 1; i <= (numeroIntroducido + 5); i++){
      cuadrado = Math.pow(i, 2);
      cubo = Math.pow(i, 3);
      System.out.printf("%-5d %5.0f %5.0f \n",i,cuadrado,cubo); 
    }
    System.out.println(""); //SALTO DE LINEA
  }
}
