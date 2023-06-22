import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("------------- CONVERSOR M PRA CM ------------");
    System.out.println("");

    double cm;

    System.out.print("Digite o valor em metros: \n> ");
    double m = entrada.nextDouble();

    System.out.println("");
    System.out.println("*********************************************");
    System.out.println("");

    entrada.close();

    cm = m * 100;

    System.out.printf("O valor em centimetros é: %.2f cm\n", cm);
    System.out.println("*********************************************");

  }
}