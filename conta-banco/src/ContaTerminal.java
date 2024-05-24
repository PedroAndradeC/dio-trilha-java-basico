import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    // TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

    // Exibir as mensagens para nosso usuário
    // Obter pelo Scanner os valores digitados no terminal

    System.out.println("Por favor, digite o número de usuário:");
    int numeroUsuario = sc.nextInt();
    sc.nextLine();
    System.out.println("Digite o número da agência:");
    String agencia = sc.nextLine();
    System.out.println("Agora digite o nome de usuário:");
    String nomeCliente = sc.nextLine();
    System.out.println("Agora digite seu saldo:");
    double saldo = sc.nextDouble();

    // Exibir a mensagem conta criada 
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroUsuario + " e seu saldo " + saldo + " já está disponível para saque.");
    
    sc.close();
    }
}
