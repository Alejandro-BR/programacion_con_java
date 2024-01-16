/**
 * Ejemplo 4: Gnerar numeros enteros entre [1,11)
 * 
 * Ayuda para enteneder comentarios:
 * [ incluye en matematica
 * ( excluye en matematica
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejemplo4 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*10) + 1; 
      System.out.println(numero);
    }
  }
}
