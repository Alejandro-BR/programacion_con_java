import java.util.HashMap;

/**
 * Ejemplos de uso de la clase HasMap
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class EjemploHashMap01 {
  public static void main(String[] args) {
    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Nuñez");
    m.put(921, "Cindy Nero");
    m.put(700, "Cesar Vazquez");
    m.put(219, "Victor Tilla");

    System.out.println("Los elementos de m son: \n" + m);


  }
}
