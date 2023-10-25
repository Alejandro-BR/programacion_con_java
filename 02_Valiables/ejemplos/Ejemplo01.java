/**
 * Ejemplo 1
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    
    // Tipo byte
    byte miNumByte = 100;
    System.out.println(miNumByte);
    
    //Tipo short
    short miNumShort = 5000;
    System.out.println(miNumShort);
    
    //Tipo long
    long miNumLong = 150000000L;
    System.out.println(miNumLong);
    
    //Tipo float
    float miNumFloat = 5.75f;
    System.out.println(miNumFloat);
    
    //Tipo boolean
    boolean esJavaDivertido = true;
    boolean esElProfeDivertido = false;
    System.out.println(esJavaDivertido);
    System.out.println(esElProfeDivertido);
    
    //Ejemplo del libro 1
    
    int numero = 5;
    
    System.out.println("El valor de una variable es " + numero);
    
    double x;
    double y;
    
    x = 7;
    y = 25.75;
    System.out.println("x vale " + x);
    System.out.println("y vale " + y);
    
    //Ejemplo del libro 2
    
    char letra1 = 99; //puedes poner la letra c o su codigo que es el 99
    char letra2 = 97; //a
    
    System.out.println(letra1);
    System.out.println(letra1 + "" + letra2);
    
    String miString = "a";
    char letraA = 'a';
    
    System.out.println(letraA);
    System.out.println(miString);
    
    //Ejemplo del libro 3
    
    int num1 = 9;
    int num2 = 2;
    
    System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es = " + num1%num2);
    
    //Ejemplo del libro 4
    
    int a = 2;
    int b = 9;
    
    double division;
    
    division = b / a;
    System.out.println(division);
    System.out.println("El casting de la variable b: " + (double)b);
  }
}