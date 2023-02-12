import java.util.Scanner;

public class Ejercicio3 {

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
    
    // -- Resultados --
    int max = Math.max(Math.max(num1, num2), num3);
    int min = Math.min(Math.min(num1, num2), num3);
    int mid = num1 + num2 + num3 - max - min;

    System.out.println(max + " " + mid + " " + min);

  }

}
