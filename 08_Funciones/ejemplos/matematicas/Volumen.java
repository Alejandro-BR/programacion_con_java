package matematicas;

/**
 * Funcion para calcula el volumen de un cilindro
 * 
 * @author Alejandro Barrionuevo Rosado
 *
 **/
public class Volumen {
  
  /**
   * Calcula el volumen de un cilindro.
   * Tanto el radio como la altura se deben proporcionar en las
   * mismas unidades para que el resultado sea congruente.
   * 
   * @param r radio del cilindro
   * @param h altura del cilindro
   * @return double volumen del cilindro
   */
  public static double volumenCilindro(double r, double h) {
    return Math.PI * r * r * h;  
  }
}