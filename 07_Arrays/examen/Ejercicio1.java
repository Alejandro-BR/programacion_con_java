/**
 * Ejercicio 1 Examen tema 6 y 7
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    int maximoIntervalo = 0;
    int minimoIntervalo = 0;
    int resultado;
    int intentosUsados = 0;
    boolean ganar = false;
    int numeroIntroducido;
    int opcion = 0;

    do {
      // Salida por pantalla y recoger datos
      System.out.println();   //Era recomendable meterlo en un do while y no lo hice
      System.out.println("-D-I-V-I-N-A-R-E-M-");
      System.out.println("Divinarem pensará un número entre los valores que tu decidas");
      System.out.println();
      System.out.print("Introduzca el minimo valor del intervalo: ");
      int minimo = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el maximo valor del intervalo: ");
      int maximo = Integer.parseInt(System.console().readLine());
      System.out.println("-D-I-V-I-N-A-R-E-M-");

      // Creacion del intervalo
      do {
        maximoIntervalo = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        minimoIntervalo = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
      } while ((minimoIntervalo >= maximoIntervalo));

      System.out.println("Estoy pensando en un numero entre " + minimoIntervalo + " y " + maximoIntervalo);
      System.out.println();

      // Calculo de los intentos
      int intentos = (int) (Math.log(maximoIntervalo - minimoIntervalo + 1) / Math.log(2));
      System.out.println("Tines " + intentos + " intentos");
      System.out.println();

      // Creacion del numero que buscamos
      resultado = (int) (Math.random() * (maximoIntervalo - minimoIntervalo + 1)) + minimoIntervalo;

      // Buscamos el numero
      do {
        System.out.print("Escribe el numero: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        if (numeroIntroducido > resultado) {
          System.out.println("Te has pasado");
        } else if (numeroIntroducido < resultado) {
          System.out.println("Te has quedado corto");
        } else if (numeroIntroducido == resultado) {
          ganar = true;
        }
        intentosUsados++;
      } while ((intentosUsados < intentos) && (ganar == false));

      System.out.println();

      // Final de la partida
      if (ganar == true) {
        System.out.println("Enhorabuena!!!! has acertado.");
        System.out.println("Efectivamente el numero era: " + resultado);
      } else {
        System.out.println("Has superado el numero de intentos.");
        System.out.println("El numero que habia pensado era: " + resultado);
      }

      System.out.println();

      //No lo controle con un do while tampoco
      // Menu para empezar otra partida o salir
      System.out.println("Elige una opcion");
      System.out.println("1. Volver a jugar");
      System.out.println("2. Salir del juego");
      System.out.print("Opcion: ");
      opcion = Integer.parseInt(System.console().readLine());
    } while (opcion == 1);

    System.out.println();
    System.out.println("Gracias por jugar -D-I-V-I-N-A-R-E-M-");
    System.out.println();
  }
}
