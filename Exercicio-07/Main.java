import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double base;
    double altura;
    double area;
    
    System.out.println("");

    System.out.println("----- CALCULAR AREA DO QUADRADO -----");
    System.out.println("");

    System.out.print("Digite o valor da base: \n> ");
    base = entrada.nextDouble();
    System.out.println("");

    System.out.print("Digite o valor da altura: \n> ");
    altura = entrada.nextDouble();
    System.out.println("");
    
    area = (base * altura) * 2;

    System.out.println("*************************************");
    System.out.println("");

    System.out.printf("O valor do dobro da area é: %.2f \n", area);
    
    System.out.println("");
    System.out.println("*************************************");
  }
}