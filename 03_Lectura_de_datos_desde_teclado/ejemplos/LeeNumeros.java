/**
 * Ejemplo leer nuemero
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class LeeNumeros {
  public static void main(String[] args) {

    String liena; //variable que almacena cada linea que introduzcamos por telcado

    // System.out.println("Introduce un numero entero: "); //pedimos primer numero
    // liena = System.console().readLine();

    // int num1;
    // num1 = Integer.parseInt(liena); //convertir de string a int
    
    // System.out.println("Introduce otro numero entero: "); //pedimos segundo numero
    // liena = System.console().readLine();

    // int num2;
    // num2 = Integer.parseInt(liena); //convertir de string a int

    // System.out.printf("El primer numero es: %d\n", num1);  // \n para que no aparesca en la misma linea
    // System.out.printf("El primer numero es: %d\n", num2);
    
    // System.out.println("El doble del numero " + num1 + " es " + (num1*2));
    // System.out.println(num1 + num2);



    //Parseamos float

    System.out.print("Introduce un numero real: ");
    liena = System.console().readLine(); 
    float numReal = Float.parseFloat(liena);
    System.out.printf("El numero real introducido es: %.2f", numReal);

  }
}
