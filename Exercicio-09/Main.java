import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

    double F;
    double C;
    
    System.out.println();
    System.out.println("------ CONVERSOR PARA CELCIUS -------\n");

    System.out.print("Digite a temperatura em Fahrenheit:\n> ");
    F = entrada.nextDouble();
    
    System.out.println();
    System.out.println("*************************************");
    System.out.println();

    C = (F - 32) * 5/9;

    System.out.printf("O valor em celcius é %.1f°C \n", C );
    
    System.out.println();
    System.out.println("*************************************");

  }
}