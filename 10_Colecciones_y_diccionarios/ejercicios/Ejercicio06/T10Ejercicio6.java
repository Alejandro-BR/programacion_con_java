/**
 * Ejercicio 6: Implementa el control de acceso al área restringida de un programa. 
 * Se debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados en
 * una estructura de la clase HashMap.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio06;

import java.util.HashMap;

public class T10Ejercicio6 {
  public static void main(String[] args) {
    HashMap<String, String> usuarios = new HashMap<>();
    String usuario;
    String contraseña;
    int intentos = 3;
    boolean iniciar = false;

    usuarios.put("alejandro", "1234");
    usuarios.put("admin", "admin1234");
    usuarios.put("programador", "programador1234");

    do {
      System.out.print("\nUsuario: ");
      usuario = System.console().readLine(); 
      System.out.print("Contraseña: ");
      contraseña = System.console().readLine(); 

      //Devuelve true si el diccionario contiene la clave indicada y false en caso contrario.
      if (usuarios.containsKey(usuario)) { 
        //Obtiene el valor correspondiente a una clave. 
        //Devuelve null si no existe esa clave en el diccionario.
        if (usuarios.get(usuario).equals(contraseña)) {
          iniciar = true;
        } else {
          System.out.println("\nIntroduciste una contraseña incorrecta");
        }
      } else {
        System.out.println("\nUsuario no existente");
      }
      intentos--;
    } while (!iniciar && intentos > 0);

    if (iniciar) {
      System.out.println("\nHa accedido al área restringida\n");
    } else {
      System.out.println("\nLo siento, no tiene acceso al área restringida\n");
    }

  }
}
