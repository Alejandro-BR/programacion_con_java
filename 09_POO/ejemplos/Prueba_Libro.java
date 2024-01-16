/**
 * La clase que contendra el metodo principal o main
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Prueba_Libro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Frank Thilliez";
    lib.paginas = 490;
    System.out.println("Titulo: " + lib.titulo);
    System.out.println("Autor: " + lib.autor);
    System.out.println("Numeros de paginas: " + lib.paginas);
    System.out.println("Edicion: " + lib.edicion);
  }
}
