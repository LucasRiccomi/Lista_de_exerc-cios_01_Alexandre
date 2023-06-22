import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        double tamanhoarquivo;
        double velocidadeconxao;
        double tempodownload;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho do Arquivo em MB: ");
        tamanhoarquivo = input.nextDouble();
        System.out.println("Informe a velocidade da conexão em Mbps: ");
        velocidadeconxao = input.nextDouble();
        input.close();

        tempodownload = (tamanhoarquivo * 8) / (velocidadeconxao * 60);

        System.out.printf("O tempo estimado de download é de %.2f", tempodownload);   
        
    }
    
}