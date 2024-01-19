/**
 * Prueba de la clase cubo
 * 
 * @author Alejandro Barrionuevo Rosado
 */
public class PruebaCubo {
  public static void main(String[] args) {
    Cubo cubo = new Cubo(10);
    Cubo cuboDestino = new Cubo(8);

    cubo.setContenido(6);
    cuboDestino.setContenido(1);


    System.out.println(cubo.toString());
    System.out.println(cuboDestino.toString());

    System.out.println();
    System.out.println();

    // cubo.pinta();
    // System.out.println();
    // cuboDestino.pinta();

    cubo.vuelcaEn(cuboDestino);

    cubo.pinta();

    cuboDestino.pinta();

    System.out.println();

  }
}
