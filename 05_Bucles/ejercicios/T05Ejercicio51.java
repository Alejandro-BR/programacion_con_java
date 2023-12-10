/**
 * Ejercicio 51: El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
 * (todos los que encuentre). Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 * 
 * Ejemplo 1:
 * 
 * Introduzca un número entero (mayor que cero): 51803458
 * Después de haber sido comido por el gusano numérico se queda en 51345
 * 
 * Ejemplo 2:
 * 
 * Introduzca un número entero (mayor que cero): 29614
 * El gusano numérico no se ha comido ningún dígito.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.InputMismatchException;
import java.util.Scanner; 
public class T05Ejercicio51 {
  public static void main(String[] args) {
    try {
      long numero;
      long numeroAuxiliar;
      long copiaNumero;
      long digito;
      long numeroVolteado = 0;
      boolean num0 = false;
      boolean num8 = false;
      int contador = 0;

      Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 

      System.out.println(""); //SALTO DE LINEA 

      do {
        System.out.print("Introduzca un número entero (mayor que cero): ");
        numero = sc.nextLong();
      } while (numero < 0);

      sc.close(); //Cierre del Scanner 

      copiaNumero = numero;
      while (copiaNumero > 0) {
        numeroVolteado = ((numeroVolteado * 10) + (copiaNumero % 10));
        copiaNumero /= 10;
        contador++;
      }

      numeroAuxiliar = numeroVolteado;
      for (int i = 0; i < contador; i++) {
        digito = numeroAuxiliar;
        digito %= 10; 
        numeroAuxiliar /= 10;
        if (digito == 8) {
          num0 = true;
        } else if (digito == 0){
          num8 = true;
        }
      }

      if ((num0 == true) ||( num8 == true)) {
        numeroAuxiliar = numeroVolteado;
        System.out.print("Después de haber sido comido por el gusano numérico se queda en ");
        while (numeroAuxiliar != 0) {
          digito = numeroAuxiliar;
          digito %= 10; 
          numeroAuxiliar /= 10;
          if ((digito == 0) || (digito == 8)) {
            System.out.print("");
          } else {
            System.out.print(digito);
          }
        }
      } else {
        System.out.println("El gusano numérico no se ha comido ningún dígito. ");
      }

      System.out.println(""); //SALTO DE LINEA 

    } catch (InputMismatchException ime){ 
      System.out.println(""); // SALTO DE LINEA
      System.out.println("No se perimiten introducir caracteres o letras.");
      System.out.println(""); // SALTO DE LINEA
    } catch (Exception e) {
      System.out.println(""); // SALTO DE LINEA
      System.out.println("Mensaje de error: " + e.getMessage());
      System.out.println("Clase de la excepcion: " + e.getClass());
      System.out.println(""); // SALTO DE LINEA
    }
  }
}
