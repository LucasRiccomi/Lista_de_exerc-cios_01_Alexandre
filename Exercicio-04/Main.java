import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

      double nota1;
      double nota2;
      double nota3;
      double nota4;
      double media;
      double soma;

      Scanner input = new Scanner(System.in);
      System.out.println("Digite a prieira nota: ");
      nota1 = input.nextDouble();
      System.out.println("Digite a segunda nota: ");
      nota2 = input.nextDouble();
      System.out.println("Digite a terceira nota: ");
      nota3 = input.nextDouble();
      System.out.println("Digite a quarta nota: ");
      nota4 = input.nextDouble();
      input.close();

      soma = nota1 + nota2 + nota3 + nota4;
      media = soma / 4;
      
      //Resultado
      System.out.println("A media das notas é: " +media);
        
    }


}