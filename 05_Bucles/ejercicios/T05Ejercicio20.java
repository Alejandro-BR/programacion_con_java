import java.util.Scanner;

/**
 * Ejercicio 20: Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T05Ejercicio20 {
  public static void main(String[] args) {
    String simbolo = " ";

    System.out.println(""); //SALTO DE LINEA 

    System.out.println("MENU:");
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Entre estos digitos elige el que quieres usar en la piramide: ");
    System.out.println(" * + - $ & (Tambien se permite cualquier otro)");
    System.out.println("Elige que sea una piramide normal (1) o invertida (2).");

    System.out.println(""); //SALTO DE LINEA 
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el simbolo: ");
    simbolo = sc.nextLine();
    System.out.print("Introduce la altura: ");
    int altura = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    System.out.println(""); //SALTO DE LINEA 
    if (altura > 1) {
      for (int l = 1; l <= altura; l++){
        System.out.print(" ");
      }
      System.out.println(simbolo);
      for (int i = 1; i <= altura - 1; i++){   //ESPACIOS
        for (int j = 1; j <= (altura - i); j++){
          System.out.print(" "); 
        }
        System.out.print(simbolo);   //PRIMER SIMBOLO DE CADA LINEA
        for(int k = 1; k <= (3* (i - 2)) ; k++ ){   //ESPACIOS DENTRO DEL TRIANGULO
          System.out.print(" ");    
        }
        System.out.print(simbolo); //SEGUNDO SIMBOLO DE CADA LINEA
        System.out.println(" "); //SALTO DE LINEA 
      }
      for (int u = 1; u <= altura * 2; u++){  //ESTO ES PARA LA ULTIMA LINEA
        System.out.print(simbolo);
      }
    } else if (altura == 1) {
      System.out.println(" " + simbolo);
    }  else {
      System.out.println("Introduce un valor correcto.");
    }

    System.out.println(""); //SALTO DE LINEA

  }
}