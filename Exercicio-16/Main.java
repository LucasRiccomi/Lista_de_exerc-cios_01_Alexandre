import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

      double metrosquadrados;
      double litrostintas;
      double latastintas;
      double total;

     Scanner input = new Scanner(System.in);
     System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
     metrosquadrados = input.nextDouble();
     input.close();
     
     litrostintas = Math.ceil (metrosquadrados / 3);
     latastintas = Math.ceil (litrostintas / 18);
     total = latastintas * 80;

     System.out.println("A quantidade de latas de tintas a serem compradas é: " +latastintas);
     System.out.println("O preço total é de: R$" +total);

    }
    
}