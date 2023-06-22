import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

  double hora_trab;
  double valor_hora;
  double salario;
    
    System.out.println("");
    System.out.println("------- SALÁRIO POR HORA TRAB. ------");
    System.out.println("");

    System.out.print("Digite o valor de quantas horas trabalhou no mês: \n> ");
    hora_trab = entrada.nextDouble();
    System.out.println("");

    System.out.print("Digite o valor da sua hora trabalhada: \n> ");
    valor_hora = entrada.nextDouble();
    System.out.println("");

    salario = hora_trab * valor_hora;
    
    System.out.println("");
    System.out.println("*************************************\n");
    
    System.out.printf("O valor do seu salário bruto é: R$%.2f \n",salario);

    System.out.println("");
    System.out.println("*************************************");

    
    
  }
}