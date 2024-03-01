/**
 * Ejercicio 7: La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 
 * Ejemplo:
 * 2 céntimos – cara
 * 2 céntimos – cruz
 * 50 céntimos – cruz
 * 1 euro – cruz
 * 1 euro – cara
 * 10 céntimos – cara
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio07;

import java.util.ArrayList;

public class Eurocoin {
  public static void main(String[] args) {
    ArrayList<Moneda> monedas = new ArrayList<>();
    boolean seguir = true;
    int[] tipo = {0,1};

    do {
      System.out.print("\nQuieres crear una nueva moneda: (si o no) ");
      String respuesta = System.console().readLine();
      System.out.println();

      if (respuesta.equals("si")) {
        int aleatorio = (int)(Math.random()*2);
        if (tipo[aleatorio] == 0) {
          monedas.add(new Euro());
        } else {
          monedas.add(new Centimo());
        }
      } else {
        seguir = false;
      }

      for (Moneda moneda : monedas) {
        System.out.println(moneda.toString());
      }

      
    } while (seguir);
    
    System.out.println();
  }
}
