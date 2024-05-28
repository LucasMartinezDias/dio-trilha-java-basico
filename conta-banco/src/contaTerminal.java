import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.printf("Por favor, digite o número da Agência: ");

        int numero = sc.nextInt();

        System.out.printf("Digite sua Agência: ");

        String agencia = sc.next();

        System.out.printf("Insira o seu nome completo: ");

        String nome = sc.next();
        sc.nextLine();

        System.out.printf("Insira o seu saldo: ");
        String saldoStr = sc.nextLine();
        double saldo = Double.parseDouble(saldoStr.replace(',', '.'));

        System.out.println("Olá " + nome + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " conta " + numero + " seu saldo de: " + saldo + " já está disponível para saque");

    }
}
