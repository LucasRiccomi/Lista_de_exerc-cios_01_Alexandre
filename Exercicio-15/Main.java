import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        double valorhora;
        double horastrabalhadas; 
        double salariobruto;
        double ir;
        double inss;
        double sindicato;
        double salarioliquido;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe quanto ganha por hora: ");
        valorhora = input.nextDouble();
        System.out.println("Informe as horas trabalhadas: ");
        horastrabalhadas = input.nextDouble();
        input.close();

        salariobruto = valorhora * horastrabalhadas;
        ir = salariobruto * 0.11;
        inss = salariobruto * 0.08;
        sindicato = salariobruto * 0.05;
        salarioliquido = salariobruto - ir - inss - sindicato; 
        System.out.println("");

        System.out.println("Salário bruto é: R$ " +salariobruto);
        System.out.println("");
        System.out.println("Valor pago ao INSS é: R$ " +inss);
        System.out.println("");
        System.out.println("Valor pagao ao Sindicato é: R$ " +sindicato);
        System.out.println("");
        System.out.printf("Salário Líquido é: R$ %.2f" ,salarioliquido);
        
    }
    
}