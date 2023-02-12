import java.util.Scanner;

public class Ejercicio2 {

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
    if (num1 > num2) {
        System.out.println(num1 + " es mayor que " + num2);
      } else if (num1 < num2) {
        System.out.println(num2 + " es mayor que " + num1);
      } else {
        System.out.println(num1 + " y " + num2 + " son iguales");
      }

  }

}
