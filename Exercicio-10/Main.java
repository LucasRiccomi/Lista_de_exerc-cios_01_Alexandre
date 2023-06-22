import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

    double F;
    double C;

    System.out.println();
    System.out.println("------ CONVERSOR PARA Fahrenheit -------\n");

    System.out.print("Digite a temperatura em Celcius:\n> ");
    C = entrada.nextDouble();

    System.out.println();
    System.out.println("*************************************");
    System.out.println();
    
    F = (C * 9/5) + 32;

    System.out.printf("O valor em Fahrenheit é %.1f°C \n", F );
    
    System.out.println();
    System.out.println("*************************************");

  
  
  
  
  
  
  
  }
}