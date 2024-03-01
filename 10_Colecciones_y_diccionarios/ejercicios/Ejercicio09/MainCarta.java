/**
 * Ejercicio 9: Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * 
 * No me funciona lo de ordenar y no consigo solucionarlo.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio09;
import java.util.ArrayList;
//import java.util.Collections;


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

    //Collections.sort(baraja);

    for (Carta carta : baraja) {
      System.out.println(carta.toString());
    }

    System.out.println();
  }
}
