public class NumerosAleatorios {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(Math.random() * 10);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println((int) (Math.random() * 10));
    }

    for (int i = 0; i < 10; i++) {
      System.out.println((int)(Math.random() *11 + 50));
    }

  }
}
