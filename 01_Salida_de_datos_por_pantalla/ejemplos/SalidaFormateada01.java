/**
 * Salida formateada utilizando enteros, decimales y decimales con precision
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class SalidaFormateada01 {
  public static void main(String[] args) {
    System.out.printf("El numero %d no tiene decimales. \n", 21);
    System.out.printf("El numero %f sale con decimales. \n", 21,0);
    System.out.printf("El %.3f sale exactamente con %d decimales. \n", 50.0, 3);
    System.out.printf("Letra: €c. \n", 85);

    //Pra ver el ORDEN
    System.out.printf("Mostramos el segundo argumento: %2$d \nY despues el priemro : %$f", 23.0, 56);
    
  }
}
