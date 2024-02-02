/**
 * Prueba de las clase Animal y todas sus subclases
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class PruebaAnimal {
  public static void main(String[] args) {

    Gato2 garfield = new Gato2(Sexo.MACHO, "romano");
    Gato2 manchitas = new Gato2(Sexo.MACHO);
    Gato2 noa = new Gato2(Sexo.HEMBRA);
    Gato2 silvestre = new Gato2();

    System.out.println();
    System.out.println(garfield);
    System.out.println(manchitas);
    System.out.println(noa);
    System.out.println(silvestre);
    System.out.println();

    Ave miLoro = new Ave();

    System.out.println();
    miLoro.aseate();
    miLoro.vuela();
    System.out.println();

    Pinguino pingu = new Pinguino(Sexo.HEMBRA);

    System.out.println();
    pingu.aseate();
    pingu.vuela();
    System.out.println();
  }
}
