import java.util.Scanner;

public class Ejercicio5 {
     
  public static void main(String[] args) {

    // Objeto Scanner
    Scanner scanner = new Scanner(System.in);

    // Ingresar una frase
    System.out.print("Ingresa una frase: ");
    String frase = scanner.nextLine();

    if (frase.contains("m")) {
      System.out.println("Se ha encontrado la letra 'm'");
    } else if (frase.contains("b")) {
      System.out.println("Se ha encontrado la letra 'b'");
    } else if (frase.contains("y")) {
      System.out.println("Se ha encontrado la letra 'y'");
    } else {
      System.out.println("No se ha encontrado ninguna de las letras 'm', 'b' o 'y'");
    }

  }

}
