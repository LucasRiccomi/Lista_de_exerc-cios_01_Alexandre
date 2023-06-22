import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

    double raio;
    double area;
    
    System.out.println("------- CALCULAR AREA CIRCULO -------");
    System.out.println("");

    System.out.print("Digite o valor do raio: \n> ");
    raio = entrada.nextDouble();

    area = Math.pow(raio,2) * 3.14;//Utilizando o Math.pow para elevar o valor de raio a 2, no parênteses colocamos o número "," o expoente (4,2), quatro elevado ao quadrado.

          
    System.out.println("*************************************");
    System.out.println("");
  

    System.out.printf("O valor da área é: %.2f\n", area);

    System.out.println("");
    System.out.println("*************************************");

  }
}