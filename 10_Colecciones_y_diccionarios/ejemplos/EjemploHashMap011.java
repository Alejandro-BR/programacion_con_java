/**
 * Uso del metodo get
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.HashMap;

public class EjemploHashMap011 {
  public static void main(String[] args) {
    HashMap<Integer, String> m = new HashMap<>();
    int clave;

    m.put(924, "Amalia Nuñez");
    m.put(921, "Cindy Nero");
    m.put(700, "Cesar Vazquez");
    m.put(219, "Victor Tilla");

    System.out.println("Los elementos de m son: \n" + m);

    System.out.print("Introduce la clave: ");
    clave  = Integer.parseInt(System.console().readLine());
    System.out.println("Su valor es: " + m.get(clave));

  }
}
