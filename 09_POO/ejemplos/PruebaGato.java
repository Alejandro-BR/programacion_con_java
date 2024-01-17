/**
 * Prueba de la clase Gato
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class PruebaGato {
  public static void main(String[] args) {

    Gato garfield = new Gato("Garfield");
    System.out.println(garfield.nombre);
    System.out.println(garfield.color);
    System.out.println(garfield.raza);
    System.out.println(garfield.sexo);
    System.out.println(garfield.edad);
    System.out.println(garfield.peso);

    Gato botas = new Gato("Botas", "Negro", "Egipcio", "Macho", 5, 4.2);
    botas.edad = 6;
    System.out.println(botas.nombre);
    System.out.println(botas.color);
    System.out.println(botas.raza);
    System.out.println(botas.sexo);
    System.out.println(botas.edad);
    System.out.println(botas.peso);

    // Gato missy = new Gato();
    // missy.sexo = "hembra";

    // garfield.come("Carne");
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.peleaCon(botas);
    // botas.peleaCon(missy);
  }
}
