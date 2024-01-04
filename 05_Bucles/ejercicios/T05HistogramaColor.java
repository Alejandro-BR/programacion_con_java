public class T05HistogramaColor {
  public static void main(String[] args) {
    try {
      int cifraIntroducida = 0; // Almacena la cifra introducida
      long numeroCompleto = 0; // El numero formado al introducir las cifras
      long numeroVolteado = 0; // Volteamos el numero
      int digito = 0;
      int digitoMayor = 0;
      int numeroDigitos = 0;

      System.out.println(""); //SALTO DE LINEA 
      System.out.println("Introduzca numeros entre 0 y 9 y pulsa INTRO. Introduce un numero negativo si desea parar.");

      do {
        cifraIntroducida = Integer.parseInt(System.console().readLine());
        if (cifraIntroducida >= 0 && cifraIntroducida <= 9) {
          numeroCompleto = (numeroCompleto * 10) + cifraIntroducida;
        }
      } while (cifraIntroducida >= 0);

      // Le damos la vuelta al numero y ademas vamos a ver cual es el digito mayor
      while (numeroCompleto > 0) {
        digito = (int) (numeroCompleto % 10);
        if (digito > digitoMayor) {
          digitoMayor = digito;
        }
        numeroVolteado = (numeroVolteado * 10) + digito;
        numeroCompleto /= 10;
        numeroDigitos++;
      }

      System.out.println(""); //SALTO DE LINEA 

      // Empezamos a mostrarlo en forma de tabla, teniendo en cuenta que hay que pinta
      // digitoMayor +1 columnas y numeroDigitos filasç
      int numeroColumnas = digitoMayor + 1;
      int numeroFilas = numeroDigitos;

      // Pintamos la primera hilera de guiones
      for (int i = 1; i <= numeroColumnas; i++) {
        System.out.print(" ---");
      }

      // Empezamos a pintar las filas
      for (int i = 1; i <= numeroFilas; i++) {
        digito = (int) (numeroVolteado % 10); // Cojo el digito menos significativo del numeroVolteamos

        System.out.println(); // SALTO DE LINEA
        System.out.print("| " + digito + " |"); // Pintamos la 1ª columna, la de los digitos introducidos

        // Pintamos tantas columnsas con asteriscos como indique el digito
        for (int j = 1; j <= digito; j++) {
          System.out.print(" * |");
        }

        // Pintamos el resto de columnas sin asterisco
        for (int j = 1; j < numeroColumnas - digito; j++) {
          System.out.print("   |");
        }
        System.out.println(); // SALTO DE LINEA

        for (int j = 1; j <= numeroColumnas; j++) {
          System.out.print(" ---");
        }

        numeroVolteado /= 10;
      }

      System.out.println(""); //SALTO DE LINEA 
      System.out.println(""); //SALTO DE LINEA 

    } catch (Exception e) {
      System.out.println("Mensaje de error: " + e.getMessage()); // e.getMessage()
      System.out.println("Clase del error: " + e.getClass()); // e.getClass()
    }
  }
}
