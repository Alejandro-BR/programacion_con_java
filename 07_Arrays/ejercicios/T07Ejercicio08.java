/**
 * Ejercicio 8: Realiza un programa que pida la temperatura media que ha hecho
 * en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T07Ejercicio08 {
  public static void main(String[] args) {
    try {
      String[] mes = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
      };

      int[] temperatura = new int[12];

      System.out.println();

      //Escribir el array de temperatura
      for (int i = 0; i < temperatura.length; i++) {
        System.out.print("Introduce la temperatura media del mes de " + mes[i] + ": ");
        temperatura[i] = Integer.parseInt(System.console().readLine());
      }

      System.out.println();

      //Mostramos por pantalla en forma de histograma
      for (int i = 0; i < temperatura.length; i++) {
        System.out.printf("%-12s |", mes[i]);
        for (int j = 0; j < temperatura[i]; j++) {
          System.out.print("#");
        }
        System.out.println();
      } 

      System.out.println(); //SALTO DE LINEA 

    } catch (Exception e) {
      System.out.println("Mensaje de error: " + e.getMessage());
      // e.getClass()
    }
  }
}
