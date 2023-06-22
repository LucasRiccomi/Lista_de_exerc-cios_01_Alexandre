import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int mulher;
        int homem;
        int usuario;
        double altura;
        double pesoideal;

        Scanner input = new Scanner(System.in);
        System.out.println("Responda com 1 ou 2: \n 1-Homem \n 2-Mulher \n");
        usuario = input.nextInt();
        homem = 1;
        mulher = 2;
        
            if (usuario > 2)
            {
                System.out.println("Número inválido");
                return;
            }
        
        System.out.println("Informe sua altura: ");
        altura = input.nextDouble();
        input.close();

        if (usuario == homem){
            pesoideal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideial é: " +pesoideal);

        }
        else if (usuario == mulher){
            pesoideal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideial é: " +pesoideal);

        }      
    }   
}