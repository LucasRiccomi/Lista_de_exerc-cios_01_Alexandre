import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
      double numero1;
      double numero2;
      double soma;

      Scanner input = new Scanner(System.in);
      System.out.println("Digite o primeiro valor: ");
      numero1 = input.nextDouble();
      System.out.println("Digite o segundo valor: ");
      numero2 = input.nextDouble();
      input.close();

      soma = numero1 + numero2;
  
      System.out.println("A soma dos dois valores é: " +soma);   

    }

    
}