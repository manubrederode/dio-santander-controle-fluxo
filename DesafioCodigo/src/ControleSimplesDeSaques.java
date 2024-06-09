import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite diário: ");
        double limiteDiario = scanner.nextDouble();
        double saque  = 0;

        for (double valorSaque  = saque; limiteDiario >valorSaque ;limiteDiario-=valorSaque){

            System.out.println("Informe o valor para saque: ");
            saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            } else {
                if (saque <= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
                } else {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }
            }
       }
       scanner.close();
   }
}
