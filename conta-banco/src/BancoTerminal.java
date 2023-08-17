import java.util.Scanner;

public class BancoTerminal {
public static void main(String[] args) {
    String nomeCliente, agencia;
    int conta;
    double saldo;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá. Digite seu nome: ");
        nomeCliente = scanner.nextLine();

    System.out.println("Digite sua Agencia: ");
        agencia = scanner.nextLine();

    System.out.println("Digite o Numero da Conta: ");
        conta = scanner.nextInt();

    System.out.println("Digite o Saldo: ");
        saldo = scanner.nextDouble();

    scanner.close();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta +  " e seu saldo " + saldo + " já está disponível para saque.");
}

    
}
