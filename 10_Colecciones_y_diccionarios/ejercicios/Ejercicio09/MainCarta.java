/**
 * Ejercicio 9: Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package Ejercicio09;

import java.util.ArrayList;
import java.util.Collections;

public class MainCarta {
  public static void main(String[] args) {
    final int TOTAL_CARTAS = 10;
    ArrayList<Carta> baraja = new ArrayList<>();

    Carta c = new Carta();
    baraja.add(c);

    for (int i = 1; i < TOTAL_CARTAS; i++) {
      do {
        c = new Carta(); //Nueva carta
      } while (baraja.contains(c)); // Mientras la baraja contenga la carta se repite
      baraja.add(c);
    }

    System.out.println();

    Collections.sort(baraja);

    for (Carta carta : baraja) {
      System.out.println(carta.toString());
    }

    System.out.println();
  }
}