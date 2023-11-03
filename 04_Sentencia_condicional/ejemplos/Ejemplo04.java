/**
 * Ejemplo de else if
 * 
 * 3/11/23
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Ejemplo04 {
  public static void main(String[] args) {
    int time = 22;
    if (time < 10){
      System.out.println("Good morning.");
    }else if (time < 18){
      System.out.println("Good day.");
    }else{
      System.out.println("Introduce una fecha correcta");
    }
  }
}
