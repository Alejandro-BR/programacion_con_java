/**
 * Ejercicio 19: Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T05Ejercicio19 {
  public static void main(String[] args) {
    String digito = " ";

    System.out.println(""); //SALTO DE LINEA 

    System.out.println("MENU:");
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Entre estos digitos elige el que quieres usar en la piramide: ");
    System.out.println(" * + - $ & (Tambien se permite cualquier otro)");
    System.out.println("Elige que sea una piramide normal (1) o invertida (2).");

    System.out.println(""); //SALTO DE LINEA 
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el digito: ");
    digito = sc.nextLine();
    System.out.print("Introduce la altura: ");
    int altura = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 

    for (int i = 1; i <= altura; i++){
      for (int k = 1; k <= (altura - i); k += 2){
        System.out.print(" "); 
      }
      for(int j = 0; j <= (2*i) ; j++ ){
        System.out.print(digito);
      }
      System.out.println(" "); //SALTO DE LINEA 
    }

    System.out.println(""); //SALTO DE LINEA

    // System.out.println("    " + digito);
    // System.out.println("   " + digito + " " + digito);
    // System.out.println("  " + digito + "   " + digito);
    // System.out.println(" " + digito + "     " + digito);
    // System.out.println(digito + digito + digito + digito + digito + digito + digito + digito + digito);
  }
}
