/**
 * Ejercicio 21:
 * 
 * La asociación “Amigos de los anfibios” nos ha encargado una aplicación
 * educativa sobre estos animalitos. Crea un programa que pida al usuario el
 * tipo de anfibio y que, a continuación, nos muestre su hábitat y
 * su alimentación. Si el tipo de anfibio introducido no existe, se debe
 * mostrar el mensaje “Ese tipo de anfibio no existe”.
 * 
 * Ejemplo 1:
 * 
 * Introduzca el tipo de anfibio: salamandra
 * Hábitat: Ecosistemas húmedos.
 * Alimentación: Pequeños crustáceos e insectos.
 * 
 * Ejemplo 2:
 * 
 * Introduzca el tipo de anfibio: gato
 * Ese tipo de anfibio no existe.
 * 
 * La información se debe guardar en dos diccionarios (dos HashMap).
 * Uno de ellos tendrá parejas clave-valor del tipo (tipo de anfibio,
 * hábitat) y otro (tipo de anfibio, alimentación). A continuación
 * se muestra la información en una tabla:
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.HashMap;

public class T10Ejercicio21 {
  public static void main(String[] args) {
    // Informacion sobre los anfibios
    final HashMap<String, String> HABITAT = new HashMap<String, String>() {
      {
        put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas.");
        put("salamandra", "Ecosistemas humedos.");
        put("sapo", "En cualquier sitio salvo el desierto y la Antartida");
        put("triton", "America y Africa.");
      }
    };
    final HashMap<String, String> ALIMENTO = new HashMap<>() {
      {
        put("rana", "Larvas e insectos.");
        put("salamandra", "Pequeños crustaceos e insectos.");
        put("sapo", "Insectos, lombrices y pequeños roedores.");
        put("triton", "Insectos.");
      }
    };

    String anfibio = "";

    System.out.println("\nInformacion sobre Anfibios\n");
    System.out.println("Reglas:");
    System.out.println("- Introduce el nombre del anfibio para ver su informacion.");
    System.out.println("- Introduce salir para terminar el program.");

    do {
      System.out.print("\nIntroduzca el tipo de anfibio: ");
      anfibio = System.console().readLine(); 

      if (anfibio.equalsIgnoreCase("salir")) {
        System.out.println("¡Hasta pronto!\n");
      } else if (HABITAT.get(anfibio) == null) {
        System.out.println("Ese tipo de anfibio no existe.");
      } else {
        System.out.println("Habitat: " + HABITAT.get(anfibio));
        System.out.println("Alimentacion: " + ALIMENTO.get(anfibio));
      }
      
    } while (!anfibio.equalsIgnoreCase("salir"));
  }
}
