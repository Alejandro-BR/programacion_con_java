/**
 * Ejemplo 2 del tema 7 - Arrays
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Array02 {
  public static void main(String[] args) {
    int [] n = {26, -30, 0, 100, 50};

    System.out.println("Los valores del array son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[4]);

    int suma = n[1] + n[3];
    System.out.println("El resultado de la suma del segundo y el cuarto es " + suma);

    System.out.println("El array contine " +  n.length + " elementos. ¿Cual deseas ver? (0-4)");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.print("El elemento que se encuentra en la posicion " + indice + " es el " + n[indice]);
  }
}
