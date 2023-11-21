/**
 * Ejercicio 2 examen: En un edificio residencial, se desea simular el comportamiento de un ascensor mediante un programa en Java. El ascensor tiene un límite de peso y de personas y puede viajar entre diferentes pisos. Se te pide que implementes un programa que maneje el funcionamiento del ascensor con las siguientes condiciones:

    El ascensor puede viajar entre un mínimo de dos pisos. Por ejemplo, si el ascensor está en el piso 1, no subirá al 2 ni bajará al 0.
    El ascensor no puede ir más allá del piso máximo (10) ni por debajo del piso mínimo (0).
    El ascensor puede subir o bajar dependiendo del piso actual y el piso seleccionado.
    Debe haber un límite de peso máximo de 300 kg que el ascensor puede soportar. Decláralo como una constante.
    Debe haber un límite de hasta 4 personas. Decláralo como una constante.
    El flujo del programa es el siguiente:
    Se le pide al usuario a que piso desea viajar, el número de personas y el peso. Si indica -1, el programa finalizará. El programa se repetirá en bucle mientras el piso indicado sea distinto de -1.
    En caso contrario, se comprobará si el ascensor puede viajar teniendo en cuenta las condiciones 1 y 2. En caso de no poder hacerlo, se mostrará un mensaje informativo indicando que se rechaza la solicitud.
    Si el ascensor llega al límite de peso o al límite de personas, se rechazará la solicitud y se mostrará un mensaje informativo de ello, según corresponda un caso u otro.
    Finalmente, si el usuario pide subir, aparecerá un mensaje por pantalla ("Subiendo..."), a continuación otro mensaje de que se ha llegado al piso correspondiente y se actualizará el piso actual en el que se encuentra el ascensor para tenerlo en cuenta para el siguiente usuario.
    En caso de que el usuario desee bajar, aparecerá un mensaje por pantalla ("Bajando..."), a continuación otro mensaje de que se ha llegado al piso correspondiente y se actualizará el piso actual en el que se encuentra el ascensor para tenerlo en cuenta para el siguiente usuario.
    Solo puedes usar sentencias condicionales para controlar el flujo del ascensor. A continuación tienes una plantilla de comienzo del programa.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class EjercicioExamen02 {
  public static void main(String[] args) {
    //NO ME DIO TIEMPO TERMINARLO PORQUE LO EMPECE A LAS 5 Y POCO :(


    //Declaraciones globales
    int pisoDestino = 0;
    int pisoActual = 0;
    int piso = 0;
    int numeroPersonas;
    int peso;

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    //Bucle para ejecutar el programa hasta que el usuario desee finalizar.
    while (pisoDestino != -1) {
      pisoActual = piso;
      System.out.print("Introduce el piso al que desea viajar: ");
      piso = sc.nextInt();
      System.out.print("Introduce el numero de personas: ");
      numeroPersonas = sc.nextInt();
      System.out.print("Introduce el peso: ");
      peso = sc.nextInt();
      pisoDestino = piso;
      if (pisoDestino * 2 < pisoActual) {
        
      } else if ((pisoDestino >= 10)) {
        pisoDestino = -1;
      }
    }
    sc.close(); //Cierre del Scanner 
  }
}

//El ascensor puede viajar entre un mínimo de dos pisos. Por ejemplo, si el ascensor está en el piso 1, no subirá al 2 ni bajará al 0.
//El ascensor no puede ir más allá del piso máximo (10) ni por debajo del piso mínimo (0).
//El ascensor puede subir o bajar dependiendo del piso actual y el piso seleccionado.
//Debe haber un límite de peso máximo de 300 kg que el ascensor puede soportar. Decláralo como una constante.
// Debe haber un límite de hasta 4 personas. Decláralo como una constante.