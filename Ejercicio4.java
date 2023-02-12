import java.util.Scanner;

public class Ejercicio4 {

  public static void main(String[] args) {
    
    // Objeto Scanner
    Scanner scanner = new Scanner(System.in);

    // --
    System.out.print("Ingresa un Valor: ");
    int num1 = scanner.nextInt();

    // --
    System.out.print("Ingresa otro Valor: ");
    int num2 = scanner.nextInt();

    // --
    System.out.print("Ingresa de nuevo otro Valor: ");
    int num3 = scanner.nextInt();

    // Bucle For que se repite "num3" veces y suma num1 + num2
    for (int i = 0; i < num3; i++) {
      num1 += num2;
    }

    System.out.println("El resultado es: " + num1);

  }

}
