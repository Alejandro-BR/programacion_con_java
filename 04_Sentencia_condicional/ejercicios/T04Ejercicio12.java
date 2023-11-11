/**
 * Ejercicio 12: Realiza un minicuestionario con 10 pregunsta tipo test sobre las asignaturas que se imparten en el curso. 
 * Cada pregunta acertada sumara un punto. El programa mostrara al final la clasificacion obtenidad. Pasale el minicuestionario
 * a tus compaleros y pideles que lo hagan para ver que tal andan de conocimientos en las diferente asginaturas del curso.
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class T04Ejercicio12 {
  public static void main(String[] args) {
    int puntos = 0;
    String respuesta;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("\033[33mEXAMEN TIPO TEXT DE PRIMERO DE DAW: \033[0m");
    System.out.println(""); //SALTO DE LINEA 

    //PRIMERA PREGUNTA:
    System.out.println("1. ¿Cual de estas es una variable pirmaria del lenguaje Java?");
    System.out.printf("%-9s %9s %9s \n","a) String", "b) final", "c) int");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA 

    //SEGUNDA PREGUNTA:
    System.out.println("2. ¿Que entorno IDE es mas utilizado entre estos?");
    System.out.printf("%-12s %12s %12s \n","a) Visual Studio Code", "b) Arduino IDE", "c) Sublime Text) ");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA 

    //TERCERA PREGUNTA:
    System.out.println("3. ¿Que HTML es el utilizado hoy en dia?");
    System.out.printf("%-9s %9s %9s \n","a) HTML3", "b) HTML5", "c) HTML");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA
    
    //CUARTA PREGUNTA:
    System.out.println("4. ¿Cada cuanto tiempo hay que cambiar la pasta termica del procesador?");
    System.out.printf("%-9s %9s %9s \n","a) Cada 2 años", "b) Nunca", "c) Cada 6 meses");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA 
    
    //QUINTA PREGUNTA:
    System.out.println("5. ¿En que año empezo la primera generacion de la computacion?");
    System.out.printf("%-9s %9s %9s \n","a) 1938", "b) 1959", "c) 1936");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA 
    
    //SEXTA PREGUNTA:
    System.out.println("6. ¿Que relacion tiene Pokemon con MT en un diagrama ER?");
    System.out.printf("%-6s %6s %50s \n","a) 1:1", "b) N:M", "c) Ambas son correctas en distintos puntos de vista");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA
    
    //SECTIMA PREGUNTA:
    System.out.println("7. ¿Cual de estas tres lineas de codigo del lenguaje Java es la correcta?");
    System.out.println("a) System.out.println(\"Hola mundo\");");
    System.out.println("b) System.out.println(Hola mundo);");
    System.out.println("c) System.out.printl(\"Hola mundo\");");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA 
    
    //OCTABA PREGUNTA:
    System.out.println("8. ¿Cual de estos son perifericos de salida?");
    System.out.printf("%-9s %9s %9s \n","a) Raton", "b) Impresora", "c) Todas son correctas");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA 
    
    //NIVENA PREGUNTA:
    System.out.println("9. ¿Que sistema se usa para la MAC de los dispositivos?");
    System.out.printf("%-9s %9s %9s \n","a) Binario", "b) Octal", "c) Hexadecimal");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA
    
    //DECIMA PREGUNTA:
    System.out.println("10. ¿Para dar formato a una pagina web que utilizamos?");
    System.out.printf("%-9s %9s %9s \n","a) CSS", "b) HTML", "c) Java");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("\033[32mCorrecto\033[0m");
      puntos++;
    } else {
      System.out.println("\033[31mIncorrecto\033[0m");
    }
    System.out.println(""); //SALTO DE LINEA
    
    //PREGUNTA EXTRA:
    System.out.println("EXTRA. ¿Te gusto el examen?");
    System.out.printf("%-9s %9s \n","a) Si", "b) No");
    System.out.println(""); //SALTO DE LINEA 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("😊");
    } else {
      System.out.println("🙁");
    }

    if (puntos >= 5) {
      System.out.println("\033[32m ");
    } else {
      System.out.println("\033[31m ");
    }
    
    System.out.println("Tienes " + puntos + " puntos. \033[0m");

    System.out.println(""); //SALTO DE LINEA
  }
}
