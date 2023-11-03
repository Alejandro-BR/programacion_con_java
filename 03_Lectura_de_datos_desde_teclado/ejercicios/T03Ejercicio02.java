import java.util.Scanner; //Importar Scanner
//import java.util.Locale;  //Importar para poder usar decimales

/**
 * Ejercicio 2: Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir deber ser introducida por teclado
 * 
 * @author Alejandro Barrionuevo Rosado
 */

//Poniendo , en vez de punto si funciona los decimales (preguntar el clase)
// quite el import porque hacia lo mismmo sin el con la ,

public class T03Ejercicio02 {
  public static void main(String[] args) {
    // 166.386 pesetas = 1 euro
    
    System.out.println(""); //SALTO DE LINEA
    System.out.println("CONVERTIDOR DE EUROS A PESETAS: ");
    System.out.println(""); //SALTO DE LINEA

    Scanner sc = new Scanner(System.in); //Creamos un objetos de la clase Scanner, llamado sc"

    System.out.print("Introduce los euoros que quieres convertir: ");
    double euros = sc.nextDouble();

    sc.close(); //Cierre del Scanner; 

    int pesetas = (int) (euros * 166.386); 
    
    System.out.printf("%.2f € --> %d pta", euros, pesetas ); //%d para quitar decimales


    //     double pesetas = (int) (euros * 166.386); 
    
    // System.out.println(""); //SALTO DE LINEA
    // System.out.print(euros + " €  --> ");
    // System.out.printf(" %.0f", pesetas);  //%.0f para que no le salga .00 como decimales
    // System.out.println(" pta");
    // System.out.println(""); //SALTO DE LINEA
  }
}