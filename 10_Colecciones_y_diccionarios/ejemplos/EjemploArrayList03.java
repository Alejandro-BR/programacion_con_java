import java.util.ArrayList;

public class EjemploArrayList03 {
  public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

    System.out.println("Nº de elementos: " + lista.size()); //"size" ver el tamaño de la lista

    //Se añade 3 elementos
    lista.add("Rojo");
    lista.add("Verde");
    lista.add("Azul");
    lista.add("Blanco");
    lista.add("Amarillo");
    
    System.out.println("Contenido de las listas: ");
    for (String color : lista) {
      System.out.println(color);
    }
  }
}
