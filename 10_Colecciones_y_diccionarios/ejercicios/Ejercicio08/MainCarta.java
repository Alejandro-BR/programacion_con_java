/**
 * Ejercicio 8: Realiza un programa que escoja al azar 10 cartas de la baraja
 * española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio08;
import java.util.ArrayList;

public class MainCarta {

  /**
   * Funcion para comprobar que ya este en la ArrayList un objeto
   * 
   * @param baraja ArrayList Carta
   * @param carta Carta
   * @param indice int
   * @return true --> el objeto se repite
   * @return false --> el objeto no se repite
   */
  private static boolean repetido(ArrayList<Carta> baraja, Carta carta) {
    for (int i = 0; i < baraja.size(); i++) {
      if ( baraja.get(i).getPalo() == carta.getPalo()) {
        if ( baraja.get(i).getValor() == carta.getValor()) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Carta> baraja = new ArrayList<>();

    Carta c = new Carta();
    baraja.add(c);

    for (int i = 1; i < 9; i++) {
      do {
        c = new Carta();
      } while (repetido(baraja,c)); //repetido(baraja,c)
      // baraja.contains(c) no funciona para objetos bien  
      baraja.add(c);
    }

    System.out.println();

    for (Carta carta : baraja) {
      System.out.println(carta.toString());
    }

    System.out.println();
  }
}
