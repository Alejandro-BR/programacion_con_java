import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo 2
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class EjemploHashMap02 {
  public static void main(String[] args) {
    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Nuñez");
    m.put(921, "Cindy Nero");
    m.put(700, "Cesar Vazquez");
    m.put(219, "Victor Tilla");

    //System.out.println("Los elementos de m son: \n" + m); 

    System.out.println("Los elementos de m utilizando entrySet son: \n" + m.entrySet());

    for (int clave : m.keySet()) {
      System.out.println(clave + " " + m.get(clave));
    }

  }
}
