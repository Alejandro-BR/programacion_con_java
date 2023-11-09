/**
 * Ejercicio 8: Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio08 {
  public static void main(String[] args) {
    System.out.println(""); //SALTO DE LINEA 

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce la primera nota: ");
    double nota1 = sc.nextDouble();
    System.out.print("Introduce la segunda nota: ");
    double nota2 = sc.nextDouble();
    System.out.print("Introduce la tercera nota: ");
    double nota3 = sc.nextDouble();
    sc.close(); //Cierre del Scanner 

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("nota media de los examenes: %.2f",media);

    if (media > 5) {
      System.out.println("Insuficiente");
    } else if ((media >= 5) || (media <= 6)) {
      System.out.println("Bien");
    } else if ((media >= 7) || (media <= 8)) {
      System.out.println("Notable");
    }else if ((media >= 9) || (media <= 10)) {
      System.out.println("Sobresaliente");
    }else {
      System.out.println("Introduce un numero correcto");
    }
    

    System.out.println(""); //SALTO DE LINEA 
  }
}
