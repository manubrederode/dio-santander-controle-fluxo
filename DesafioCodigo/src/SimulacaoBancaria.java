import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        //Loop infinito para manter o programa em execução até que o usuário decida sair.
        while (continuar) {
            System.out.println("Insira uma opção(0 - encerrar, 1- depositar, 2 - sacar, e  3 - ver saldo): ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Insira o valor de saque: ");
                    double valorSaque = scanner.nextDouble();
                    if(valorSaque > saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  //Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
