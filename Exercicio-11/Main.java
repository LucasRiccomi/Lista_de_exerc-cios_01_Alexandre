import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double numerosinteiros1;
        double numerosinteiros2;
        double numeroreal;
        double resultado1;
        double resultado2;
        double resultado3;
    

        Scanner input = new Scanner(System.in);
        System.out.println("Informe dois números inteiros: ");
        numerosinteiros1 = input.nextDouble();
        numerosinteiros2 = input.nextDouble();
        System.out.println("Informe um número real: ");
        numeroreal = input.nextDouble();
        input.close();

        resultado1 = numerosinteiros1 * 2 * numerosinteiros2 / 2;
        resultado2 = numerosinteiros2 * 3 + numeroreal;
        resultado3 = Math.pow(numeroreal, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " +resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro: "+ resultado2);
        System.out.println("o terceiro elevado ao cubo: "+ resultado3);

    }
    
}