import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Solicita e verifica o número da Agência
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita e verifica o número da Agência
            String agencia;
            boolean isAgenciaValida = false;
            do {
                System.out.println("Por favor, digite o número da Agência (apenas números):");
                agencia = scanner.nextLine();
                
                if (agencia.matches("\\d+")) {
                    isAgenciaValida = true;
                } else {
                    System.out.println("Erro: O número da Agência deve conter apenas números. Por favor, tente novamente.");
                }
            } while (!isAgenciaValida);
            
            // Solicita e verifica o número da Conta
            int numero = 0;
            boolean isNumeroValido = false;
            do {
                System.out.println("Por favor, digite o número da Conta (apenas números):");
                String numeroStr = scanner.nextLine();
                
                if (numeroStr.matches("\\d+")) {
                    numero = Integer.parseInt(numeroStr);
                    isNumeroValido = true;
                } else {
                    System.out.println("Erro: O número da Conta deve conter apenas números. Por favor, tente novamente.");
                }
            } while (!isNumeroValido);
            
            String nomeCliente = "";
            boolean isNomeClienteValido = false;
            do {
                System.out.println("Por favor, digite o nome do Cliente:");
                if (scanner.hasNextLine()) {
                    nomeCliente = scanner.nextLine();
                    if (!nomeCliente.matches("[a-zA-Z]+")) {
                        System.out.println("Erro: O nome do cliente deve conter apenas letras. Por favor, tente novamente.");
                    } else {
                        isNomeClienteValido = true;
                    }
                } else {
                    System.out.println("Erro: Nenhum nome foi fornecido. Por favor, tente novamente.");
                    scanner.nextLine(); // Limpar o buffer do scanner
                }
            } while (!isNomeClienteValido);
            
            // Solicita o saldo
            int saldo = 0;
            boolean isNumeroSaldo = false;
            do {
                System.out.println("Por favor, digite o número da Conta (apenas números):");
                String saldoStr = scanner.nextLine();
                
                if (saldoStr.matches("\\d+")) {
                    saldo = Integer.parseInt(saldoStr);
                    isNumeroSaldo = true;
                } else {
                    System.out.println("Erro: O saldo da Conta deve conter apenas números. Por favor, tente novamente.");
                }
            } while (!isNumeroSaldo);
            
            // Exibe a mensagem final
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}
