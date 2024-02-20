/**
 * Programa que gestiona usurairos de una zona restringida
 * Se disponen de 3 intentos
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.HashMap;

public class Ejercicio1 {
  public static void main(String[] args) {
    HashMap<String, String> bbdd = new HashMap<>(); // Usuario y contraseña.
    String usuario;
    String pass;
    boolean accede = false;
    int intentos = 3;

    bbdd.put("admin", "335533");
    bbdd.put("fulanito", "abcde");
    bbdd.put("menganito", "12345678");

    System.out.println();
    do {
      System.out.print("Por favor, introduce el nombre de usuario: ");
      usuario = System.console().readLine();
      System.out.print("Introduce la contraseña: ");
      pass = System.console().readLine();
      if (bbdd.containsKey(usuario)) { // el usuario existe
        if (bbdd.get(usuario).equals(pass)) { // la contraseña coincide
          System.out.println("Bienvenido a su zona privada.");
          accede = true;
        } else {
          System.out.println("Contrasñea incorrecta.");
        }
      } else {
        System.out.println("Usuario no registrado.");
      }

      if (!accede && intentos > 0) {
        intentos--;
        System.out.println("Le quedan " + intentos + " intentos.");
      }
    } while (!accede && intentos > 0);

    if (!accede) {
      System.out.println("Lo siento no podra acceder a sus datos.");
    }

    System.out.println();
  }
}