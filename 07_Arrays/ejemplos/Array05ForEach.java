/**
 * Se muestra un array de numeros de tipo double que almacena notas de alumnos
 * 
 * for (tipoDato variable : nombreArray){}
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Array05ForEach {
  public static void main(String[] args) {
    double[] notas = new double[3];
    double media = 0;
    double suma = 0;
    
    //Escritura de las posiciones del array

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota del examen nº " + (i + 1) + ": ");
      notas[i] = Double.parseDouble(System.console().readLine());
    }

    //Lectura de la array

    for (double n : notas) {
      System.out.print(n + "\t");
      suma += n;
    }

    media = suma / notas.length;
    System.err.println("\nTu nota media es: " + media);

  }
}
