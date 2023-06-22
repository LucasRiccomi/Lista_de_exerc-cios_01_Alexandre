import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        double altura;
        double peso;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        altura = input.nextDouble();
        input.close();

        peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + peso);

    }
    
}