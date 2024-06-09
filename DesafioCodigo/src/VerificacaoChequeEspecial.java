import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Informa o valor para saque: ");
        double saque = scanner.nextDouble();

        //Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        //Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            //Verifica se o saque ultrapassa o limite do cheque especial
            double saldoTotal = saldo + limiteChequeEspecial;
            if (saque <= saldoTotal)
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            else
                //Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        //Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
    
}
