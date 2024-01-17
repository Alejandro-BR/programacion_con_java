/**
 * Prueba de la clase Gato
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class PruebaGato {
  public static void main(String[] args) {

    // Gato garfield = new Gato("Garfield");
    // System.out.println(garfield.nombre);
    // System.out.println(garfield.color);
    // System.out.println(garfield.raza);
    // System.out.println(garfield.sexo);
    // System.out.println(garfield.edad);
    // System.out.println(garfield.peso);

    // Gato botas = new Gato("Botas", "Negro", "Egipcio", "Macho", 5, 4.2);
    // System.out.println(botas.nombre);
    // System.out.println(botas.color);
    // System.out.println(botas.raza);
    // System.out.println(botas.sexo);
    // System.out.println(botas.edad);
    // System.out.println(botas.peso);

    // Gato missy = new Gato();
    // missy.sexo = "hembra";

    // garfield.come("Carne");
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.peleaCon(botas);
    // botas.peleaCon(missy);

    System.out.println("¿Cuantos gatos quieres crear?: ");
    int num = Integer.parseInt(System.console().readLine());
    Gato[] gaticos = new Gato[num];
    String[] nombre = {"Garfield", "Botas", "Willy", "Pancho", "Misifu"};
    String[] colores = {"Marron", "Negro", "Pardo"};
    for (int i = 0; i < num; i++) {
      int nombreAleatorios = (int)(Math.random()*5);
      int coloresAleatorios = (int)(Math.random()*3);
      System.out.println("¿Que raza deseas?: ");
      String raza = System.console().readLine();
      gaticos[i] = new Gato(nombre[nombreAleatorios], colores[coloresAleatorios], raza, "Macho", 0, 0);
    }

    System.out.println(); //Salto de linea

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.err.println(gaticos[i].color);
      System.out.println();
    }
  }
}
