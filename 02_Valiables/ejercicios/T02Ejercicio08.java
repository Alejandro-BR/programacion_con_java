/**
 * Ejercicio 8: Escribe un programa que declare 5  variables de tipo char.
 * A continuación, crea otra variable como cadena de caracteres y asignale como valor la concatenacion de las anteriores 5 variablles.
 * Por ultimo, muestra la cadena de caracteres por pantalla ¿ Que porblemas te encuntras ? ¿Como lo has solucionado?
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T02Ejercicio08 {
  public static void main(String[] args) {
    char letraG = 'G';
    char letraA = 'A';
    char letraT = 'T';
    char letraO = 'O';
    char letraS = 'S';
    String gatos = (letraG + "" + letraA + "" + letraT + "" + letraO + "" + letraS); 
    String gatos2 = ("" + letraG +  letraA +  letraT + letraO + letraS); 

    //Me daba error al poner las variables char una tras otra con un + entre ellas
    //Cuando lo termine se me ocurrio a ver si funcionaba como con el println y les puse "" entre medio y funciono
    
    System.out.println(""); //SALTO DE LINEA
    System.out.println(gatos);
    System.out.println(gatos2);
    System.out.println(""); //SALTO DE LINEA
  }
}
