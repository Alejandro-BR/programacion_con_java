/**
 * Ejemplo que hicimos yo y David
 * 
 * 13/03/2024
 * 
 * @author Alejandro Barrionuevo Rosado
 */

import java.util.HashMap;

public class EjemploPruba {
  public static void main(String[] args) {
    HashMap<String, String> paises = new HashMap<String, String>();
    paises.put("Alemania", "Berlín"); // 1
    paises.put("Andorra", "Andorra La Vieja"); // 2
    paises.put("España", "Madrid"); // 3
    paises.put("Francia", "París"); // 4
    paises.put("Grecia", "Atenas"); // 5
    paises.put("Italia", "Roma"); // 6
    paises.put("Lituania", "Vilna"); // 7
    paises.put("Irlanda", "Dublín"); // 8
    paises.put("Bélgica", "Bruselas"); // 9
    paises.put("Hungría", "Budapest"); // 10

    //System.out.println(paises.keySet());

    for (String pais : paises.keySet()) {
      if (paises.get(pais).equals("Madrid")) {
        System.out.println(pais);
        // System.out.println(pais + " " + paises.get(pais));
      }
    }
  }
}
