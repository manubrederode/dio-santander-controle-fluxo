import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insira o número da conta: ");
            String numeroConta = scanner.nextLine();
            //veriticar se o número da conta é valido.
            verificarNumeroConta(numeroConta);
            //Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            //Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    //Método para verificar se o número da conta é válido
    private static void verificarNumeroConta(String numeroConta) {
      
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
