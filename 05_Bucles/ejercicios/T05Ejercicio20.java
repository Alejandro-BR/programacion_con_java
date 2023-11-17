import java.util.Scanner;

/**
 * Ejercicio 20: Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T05Ejercicio20 {
  public static void main(String[] args) {
    String caracter = " ";

    System.out.println(""); //SALTO DE LINEA 

    System.out.println("MENU:");
    System.out.println(""); //SALTO DE LINEA 
    System.out.println("Entre estos digitos elige el que quieres usar en la piramide: ");
    System.out.println(" * + - $ & (Tambien se permite cualquier otro)");
    System.out.println(""); //SALTO DE LINEA 
    
    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduce el simbolo: ");
    caracter = sc.nextLine();
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    int nivel = 1; //Variable que controla en que nivel estoy pintando, siendo 1 la cima de la piramide
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosPorDentro = 0;

    //Pintamos toda la piramide excepto la base
    while (nivel < alturaIntroducida)  {
      //Pintamos los espcaios por delante
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      //Pintamos el caracter
      System.out.print(caracter);

      //Pintamos los espacios por dentro
      for (int i = 1; i < espaciosPorDentro; i++) {
        System.out.print(" ");
      }

      //Pintamos el segundo caracter, excepto en el nivel 1
      if (nivel > 1) {
        System.out.print(caracter);      }

        //Saltamos de linea
        System.out.println(); 

        espaciosPorDentro += 2; //En cada nivel pintamos 2 huecos mas
        nivel ++; //Aumentamos un nivel en la piramide
        espaciosPorDelante--;

    }

    //Base de la piramide
    for (int i = 1; i < (alturaIntroducida * 2); i++){
      System.out.print(caracter);
    }

    System.out.println(""); //SALTO DE LINEA
    System.out.println(""); //SALTO DE LINEA

  }
}

    // System.out.println(""); //SALTO DE LINEA 
    // if (altura > 1) {
    //   for (int l = 1; l <= altura; l++){
    //     System.out.print(" ");
    //   }
    //   System.out.println(simbolo);
    //   for (int i = 1; i <= altura - 1; i++){   //ESPACIOS
    //     for (int j = 1; j <= (altura - i); j++){
    //       System.out.print(" "); 
    //     }
    //     System.out.print(simbolo);   //PRIMER SIMBOLO DE CADA LINEA
    //     for(int k = 1; k <= (3* (i - 2)) ; k++ ){   //ESPACIOS DENTRO DEL TRIANGULO
    //       System.out.print(" ");    
    //     }
    //     System.out.print(simbolo); //SEGUNDO SIMBOLO DE CADA LINEA
    //     System.out.println(" "); //SALTO DE LINEA 
    //   }
    //   for (int u = 1; u <= altura * 2; u++){  //ESTO ES PARA LA ULTIMA LINEA
    //     System.out.print(simbolo);
    //   }
    // } else if (altura == 1) {
    //   System.out.println(" " + simbolo);
    // }  else {
    //   System.out.println("Introduce un valor correcto.");
    // }