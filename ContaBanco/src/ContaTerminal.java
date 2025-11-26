import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por faovr, digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = sc.nextLine();
        sc.nextLine();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obriado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
