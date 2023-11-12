/**
 * Ejercicio 24:Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:
 * 
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto),
 *  los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
 * 
 *  • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 *   si se trata de un prog. junior, un prog. senior o un jefe de proyecto respectivamente.
 * 
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. 
 *  Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * 
 * Ejemplo:
 * 
 * 1 - Programador junior
 * 2 - Prog. senior
 * 3 - Jefe de proyecto
 * Introduzca el cargo del empleado (1 - 3): 2
 * ¿Cuántos días ha estado de viaje visitando clientes? 5
 * Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
 * ----------------------------------
 * | Sueldo base 1200,00            |
 * | Dietas ( 5 viajes) 150,00      |
 * |--------------------------------|
 * | Sueldo bruto 1350,00           |
 * | Retención IRPF (20%) 270,00    |
 * |--------------------------------|
 * | Sueldo neto 1080,00            |
 * ----------------------------------
 * 
 * @author Alejandro Barrionuevo Rosado
 */
import java.util.Scanner; 
public class T04Ejercicio24 {
  public static void main(String[] args) {
    
    double sueldo = 950;
    double retencion = 0.25;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");   
    System.out.println("3 - Jefe de proyecto");

    Scanner sc = new Scanner(System.in);  //Creamos un objetos de la clase Scanner, llamado sc 
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = sc.nextInt();
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diaViajes = sc.nextInt();
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = sc.nextInt();
    sc.close(); //Cierre del Scanner 

    switch (cargo) {
      case 1:
        sueldo = 950;
        break;
      case 2:
        sueldo = 1200;
        break;
      case 3:
        sueldo = 1600;
        break;
      default:
        System.out.println("No introduciste un cargo (Se te asignara el minimo)");
        break;
    }

    switch (estadoCivil) {
      case 1:
        retencion = 0.25;
        break;
      case 2:
        retencion = 0.20;
        break;
      default:
        System.out.println("No introduciste el estado civil (se te asignara el de soltero)");
        break;
    }

    double viajesPago = diaViajes * 30;
    double subtotal = viajesPago + sueldo;
    double irpf = subtotal * retencion;
    double total = subtotal - irpf;

    System.out.println(""); //SALTO DE LINEA 
    System.out.println("----------------------------------");
    System.out.printf("| %-22s%8.2f |\n","Sueldo base",sueldo); 
    System.out.printf("| %-6s (%3s viajes)%11.2f |\n","Dietas",diaViajes,viajesPago); 
    System.out.println("|--------------------------------|");
    System.out.printf("| %-22s%8.2f |\n","Sueldo bruto",subtotal);
    System.out.printf("| %-6s (%2s %%) %6.2f |\n","Retencion IRPF",(retencion * 100),irpf); 
    System.out.println("|--------------------------------|");
    System.out.printf("| %-22s%8.2f |\n","Sueldo neto",total); 
    System.out.println("----------------------------------");
    System.out.println(""); //SALTO DE LINEA 
    
  }
}