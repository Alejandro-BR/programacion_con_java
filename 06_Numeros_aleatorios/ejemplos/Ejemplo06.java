/**
 * Ejercicio 6: Generar numeros entre [-5,16)
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejemplo06 {
  public static void main(String[] args) {
    
  int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*21) -5; 
      System.out.println(numero);
    }

  }
}

