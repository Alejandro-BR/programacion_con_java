/**
 * Ejercicio 2 Examen
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Ejercicio2 {

  /**
   * Función para generar una tabla con números aleatorios
   * 
   * @param filas        int
   * @param columnas     int
   * @param maxAleatorio int
   * @return int[][]
   */
  public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {
    int[][] tabla = new int[filas][columnas];
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        tabla[i][j] = (int) (Math.random() * maxAleatorio + 1); // +1 Para incluir al numero
      }
    }
    return tabla;
  }

  /**
   * Función para generar una tabla introduciendo números manualmente
   * 
   * @param filas    int
   * @param columnas int
   * @return int[][]
   */
  public static int[][] generarTablaManual(int filas, int columnas) {
    int[][] tabla = new int[filas][columnas];
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        System.out.print("Introduce el numero: ");
        int numero = Integer.parseInt(System.console().readLine());
        tabla[i][j] = numero;
      }
    }
    return tabla;
  }

  /**
   * Función para mostrar la tabla
   * 
   * @param tabla int[][]
   */
  public static void mostrarTabla(int[][] tabla) {
    // Si no hay tabla que mande un mensaje de error
    if (tabla == null) {
      System.out.println("Primero debe generar la tabla.");
      return;
    }
    // Mostrar
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        System.out.printf("%-4d", tabla[i][j]);
      }
      System.out.println();
    }
  }

  /**
   * Función para intercambiar dos filas en la tabla
   * 
   * @param tabla int[][]
   * @param fila1 int
   * @param fila2 int
   */
  public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {  //Se puede hacer del tiron sin bucles
    int[] aux = new int[tabla[fila1].length]; // Creamos una variable auxiliar que sera una array
    // Copiamos en el aux
    for (int i = 0; i < aux.length; i++) {
      aux[i] = tabla[fila1][i];
    }
    // Intercambiar
    for (int i = 0; i < aux.length; i++) {
      tabla[fila1][i] = tabla[fila2][i]; // fila1 = fila2
      tabla[fila2][i] = aux[i]; // fila2 = aux
    }
  }

  /**
   * Función para intercambiar dos columnas en la tabla
   * 
   * @param tabla int[][]
   * @param col1  int
   * @param col2  int
   */
  public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {
    int[] aux = new int[tabla.length]; // Creamos una variable auxiliar que sera una array
    // Copiamos en el aux
    for (int i = 0; i < aux.length; i++) {
      aux[i] = tabla[i][col1];
    }
    // Intercambiar
    for (int i = 0; i < aux.length; i++) {
      tabla[i][col1] = tabla[i][col2]; // col1 = col2
      tabla[i][col2] = aux[i]; // col2 = aux
    }
  }

  /**
   * Función para sumar los elementos de una fila
   * 
   * @param tabla int[][]
   * @param fila  int
   * @return int
   */
  public static int sumarFila(int[][] tabla, int fila) {
    int suma = 0;
    for (int i = 0; i < tabla.length; i++) {
      suma += tabla[fila][i];  //No se mueve la fila
    }
    return suma;
  }

  /**
   * Función para sumar los elementos de una columna
   * 
   * @param tabla int[][]
   * @param col int
   * @return int
   */
  public static int sumarColumna(int[][] tabla, int col) {
    int suma = 0;
    for (int i = 0; i < tabla.length; i++) {
      suma += tabla[i][col]; //No se mueve la columna
    }
    return suma;
  }

  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas;
    int columnas;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma;
    int colSuma;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1: // Generar tabla en modo Aleatorio
          System.out.print("Introduce las filas que quieres: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce las columnas que quieres: ");
          columnas = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce el maximo valor aleatorio que quieres: ");
          int maxAleatorio = Integer.parseInt(System.console().readLine());
          tabla = generarTablaAleatoria(filas, columnas, maxAleatorio); // LLAMAR FUNCION
          System.out.println();
          break;
        case 2: // Generar tabla en modo Manual
          System.out.print("Introduce las filas que quieres: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce las columnas que quieres: ");
          columnas = Integer.parseInt(System.console().readLine());
          tabla = generarTablaManual(filas, columnas); // LLAMAR FUNCION
          System.out.println();
          break;
        case 3: // Mostrar la tabla
          System.out.println();
          mostrarTabla(tabla); // LLAMAR FUNCION
          System.out.println();
          break;
        case 4: // Intercambiar dos filas
          System.out.print("Introduce la primera fila: ");
          fila1 = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce la segunda fila: ");
          fila2 = Integer.parseInt(System.console().readLine());
          intercambiarFilas(tabla, fila1, fila2); // LLAMAR FUNCION
          System.out.println();
          break;
        case 5: // Intercambiar dos columnas
          System.out.print("Introduce la primera fila: ");
          col1 = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce la segunda fila: ");
          col2 = Integer.parseInt(System.console().readLine());
          intercambiarColumnas(tabla, col1, col2); // LLAMAR FUNCION
          System.out.println();
          break;
        case 6: // Sumar una fila
          System.out.print("Introduce la fila que quieres sumar: ");
          filaSuma = Integer.parseInt(System.console().readLine());
          int sumaFila = sumarFila(tabla, filaSuma); // LLAMAR FUNCION
          System.out.println();
          System.out.println("Suma: " + sumaFila);
          System.out.println();
          break;
        case 7: // Sumar una columna
          System.out.print("Introduce la columna que quieres sumar:");
          colSuma = Integer.parseInt(System.console().readLine());
          int sumaCol = sumarColumna(tabla, colSuma); // LLAMAR FUNCION
          System.out.println();
          System.out.println("Suma: " + sumaCol);
          System.out.println();
          break;
        case 8: // Salir de la aplicacion
          System.out.println("¡Gracias!");
          System.out.println();
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
