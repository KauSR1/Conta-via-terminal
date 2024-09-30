
// conhecer e importar a classe scanner
// exibir a mensagem para o nosso usuario
// obter pelo scanner o valor digitado pelo terminal
// exibir a mensagem de conta criada

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, insira seu Nome");
        String nomeClinte = scanner.next();

        System.out.println("Por favor, insira seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o valor inicial do seu Saldo !");
        double saldoDisponivel = scanner.nextDouble();

        System.out.println(" Olá " + nomeClinte + sobrenome
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                + " , e o numero da sua conta e " + numeroConta
                + "  e seu saldo inicial de " + saldoDisponivel + " já está disponível para saque ");

    }
}