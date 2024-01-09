/**
 * Ejemplo 3 tema 7 - Arrays. Recorrido de una array.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Array03 {
  public static void main(String[] args) {
    int[] num = new int[10];
    num[0] = 8;
    num[1] = 33;
    num[2] = 200;
    num[3] = 150;
    num[4] = 11;
    num[5] = 88;
    num[6] = num[2] * 10; //2000
    num[7] = num[2] / 10; //20
    num[8] = num[0] + num[1] + num[2]; //241
    num[9] = num[8];

    System.out.println("Los valores del arrya son los siguientes: ");

    //Lectura de array
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }

    System.out.println(); //SALTO DE LINEA 
  }
}
