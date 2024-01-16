/**
 * Clase de ejemplo Coche
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Coche {
  
  //////Atributos
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {

    //Nombre-clase nombre-objetos = new Nombre_clase();

    Coche miCoche = new Coche(); //Coche 1
    Coche tuCoche = new Coche(); //Coche 2

    miCoche.matricula = "1234ABC";

    System.out.println("Matricula coche 1:" + miCoche.matricula);
    System.out.println("Potencia coche 1: " + miCoche.potencia);
    System.out.println("Matricula coche 2:" + tuCoche.matricula);
    System.out.println("Potencia coche 2: " + tuCoche.potencia);
  }
}

