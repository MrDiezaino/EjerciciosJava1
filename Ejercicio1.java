import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {

    // Objeto Scanner
    Scanner scanner = new Scanner(System.in);

    // --
    System.out.print("Ingresa un Valor: ");
    int num1 = scanner.nextInt();

    // --
    System.out.print("Ingresa otro Valor: ");
    int num2 = scanner.nextInt();
    
    // -- Resultados --
    System.out.println("");
    System.out.println("Suma: " + (num1 + num2));
    System.out.println("Resta: " + (num1 - num2));
    System.out.println("Multiplicación: " + (num1 * num2));
    System.out.println("División: " + (num1 / num2));
    System.out.println("Módulo: " + (num1 % num2));

  }

}
