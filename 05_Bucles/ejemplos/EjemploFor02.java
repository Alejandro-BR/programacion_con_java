/**
 * Ejemplo de bucle For
 * Muestraa las tablas de multiplicar del 1,2,4 y 6
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class EjemploFor02 {
  public static void main(String[] args) {

    System.out.println(""); //SALTO DE LINEA
    
    for (int i = 2; i <= 6; i = i + 2){
      for (int j = 0; j <= 10; j++ ){
        System.out.println(i + " x " + j + " = " + (i*j));
      }
      System.out.println(""); //SALTO DE LINEA 
    }

  }
}
