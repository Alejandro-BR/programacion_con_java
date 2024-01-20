/**
 * Ejercicio 13: Escribe un programa que rellene un array de 100 elementos con
 * números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A
 * continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 * 
 * Ejemplo:
 * 
 * 459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413
 * 96
 * 447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88
 * 21
 * 251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402
 * 225
 * 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368
 * 466
 * 262 422 275 384 399 397 87 218 84 312 480 207 68 108
 * 
 * ¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
 * 
 * 459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413
 * 96
 * 447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88
 * 21
 * 251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409
 * 402
 * 225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481
 * 368
 * 466 262 422 275 384 399 397 87 218 84 312 480 207 68 108
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class T07Ejercicio13 {
  public static void main(String[] args) {
    int numeros[] = new int[100];

    int minimo = 500;
    int maximo = 0;
    int saltoLinea = 0;
    int aux = 0;

    System.out.println();

    // Pintamos los numeros y cogemos el mas grande y el mas pequeño
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 501); // 0 - 500
      if (minimo > numeros[i]) {
        minimo = numeros[i];
      } else if (maximo < numeros[i]) {
        maximo = numeros[i];
      }
      System.out.print(numeros[i] + " ");
      saltoLinea++;
      if (saltoLinea == 10) {
        System.out.println();
        saltoLinea = 0;
      }
    }

    // Elegimos si queremos seleccionar el minimo o el maximo
    System.out.println();
    System.out.println();
    do {
      System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
      aux = Integer.parseInt(System.console().readLine());
    } while ((aux != 1) && (aux != 2));

    switch (aux) {
      case 1:
        aux = minimo;
        break;
      case 2:
        aux = maximo;
        break;
    }

    System.out.println();

    // Pintamos la array
    saltoLinea = 0;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == aux) {
        System.out.print("**" + numeros[i] + "** ");
      } else {
        System.out.print(numeros[i] + " ");
      }
      saltoLinea++;
      if (saltoLinea == 10) {
        System.out.println();
        saltoLinea = 0;
      }
    }

    System.out.println();
  }
}
