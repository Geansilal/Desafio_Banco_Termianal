import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int conta;
        String agencia;
        String nome;
        double deposito;
        double saldo = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da Conta!");
        conta = sc.nextInt();
        System.out.println("Por favor, digite o seu Nome!");
        nome = sc.next();
        System.out.println("Por favor, quanto você irá depositar!");
        deposito = sc.nextDouble();
        saldo = saldo + deposito;




    }
}
