/**
 * Ejercicio 37: Realiza un conversor del sistema decimal al sistema de "palotes"
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca un numero entero positivo: 47021
 * El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
 * 
 * @author Alejandro Barrionuevo Rosado
 */import java.util.Scanner; 
public class T05Ejercicio37 {
  public static void main(String[] args) {
    int numero;
    int digitos = 0;
    int numeroDigitos = 0;
    int numeroVolteado = 0;
    try {

      System.out.println(""); //SALTO DE LINEA 

      Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

      do {
      System.out.print("Por favor, introduzca un numero entero positivo: ");
      numero = sc.nextInt();
      } while ( numero < 0);

      int copiaNumero = numero;

      sc.close(); //Cierre del Scanner

      System.out.print("El " + numero + " en decimal es el ");

      if (numero == 0) {   // Numero = 0
        System.out.print("- ");
      } else if (numero < 10) {  // Numero tiene una cifra
        for (int i = 0; i < numero; i++){  
          System.out.print("| ");
        }
      } else if (numero >= 10) {  //Numero muchas cifras

        while (copiaNumero > 0) {
          numeroVolteado =  ((numeroVolteado * 10) + (copiaNumero % 10));
          copiaNumero /= 10;
          numeroDigitos++;
        }

        for (int i = 0; i < numeroDigitos; i++){
          digitos = numeroVolteado % 10;
          numeroVolteado /= 10;

          for (int j = 0; j < digitos; j++){
          System.out.print("| ");
          }  
          
          if (numeroDigitos > 0) {
            System.out.print("- ");
          }
        }
      } 

      System.out.println("en el sistema de palotes.");
      System.out.println(""); //SALTO DE LINEA 

    } catch (Exception e) {
      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepcion: " + e.getClass());
      System.out.println(""); //SALTO DE LINEA 
    }

  }
}
