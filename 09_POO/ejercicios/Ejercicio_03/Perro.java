/**
 * SubClase Perro
 * 
 * Sub clase de la calse Mamifero
 * Que a su vez es sub clase de la clase Animal
 * 
 * @author Alejandro Barrionuevo Rosado
 */

public class Perro extends Mamifero{
    //////// Atributos
    private String raza;

    //////// Contructores
    /**
     * Contructor el cual se recibe el sexo y la raza
     * 
     * @param s    Sexo
     * @param raza String
     */
    public Perro(Sexo s, String raza) {
      super(s);
      this.raza = raza;
    }
  
    /**
     * Contructor donde se resive la raza
     * Sexo: Hembra
     * 
     * @param raza String
     */
    public Perro(String raza) {
      super(Sexo.HEMBRA);
      this.raza = raza;
    }
  
    /**
     * Contructor donde se resive el sexo
     * Raza: Pastor Aleman
     * 
     * @param s Sexo
     */
    public Perro(Sexo s) {
      super(s);
      raza = "Pastor Aleman";
    }
  
    /**
     * Constructor basico
     * 
     * Sexo: Hembra
     * Raza: Pastor Aleman
     */
    public Perro() {
      super(Sexo.HEMBRA);
      raza = "Pastor Aleman";
    }
  
    //////// Metodos
  
    /**
     * toString
     */
    public String toString() {
      return super.toString()
          + "Raza: " + this.raza + "\n";
    }
  
    /**
     * Hace que el perro ladre.
     */
    public void ladra() {
      System.out.println("Gua gua!");
    }
  
    /**
     * Hace que el perro coma
     * 
     * @param comida String de la comida que se le ofrece
     */
    @Override
    public void comer(String comida){
      if (comida.equals("carne")) {
        System.out.println("Hmmmm, gracias");
        System.out.println("Me encanta la carne");
      } else {
        System.out.println("Lo siento, yo solo como carne");
      }
    }
  
}
