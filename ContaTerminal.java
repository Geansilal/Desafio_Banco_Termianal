import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int agencia;
        String conta;
        String nome;
        double deposito;
        double saldo = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência!");
        agencia = sc.nextInt();
        System.out.print("Por favor, digite o número da Conta!");
        conta = sc.next();
        System.out.print("Por favor, digite o seu nome!");
        nome = sc.next();
        nome = sc.nextLine();
        System.out.print("Por favor, quanto você irá depositar!");
        deposito = sc.nextDouble();
        saldo = saldo + deposito;

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo R$ %.2f já está disponível para saque.", agencia, conta, saldo);

    }
}
