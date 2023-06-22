import java.util.Scanner;

public class Main
{
  
  public static void main(String[] args) 
   {

    double numero;
    System.out.print("Informe um número:");
  
    Scanner input = new Scanner(System.in);
    numero = input.nextDouble();
    input.close();
  
    System.out.println("O número informado foi: " +numero);
   }
}