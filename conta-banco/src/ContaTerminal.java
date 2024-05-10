import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        this.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        this.numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        System.out.println("Por favor, digite o nome do Cliente:");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        this.saldo = scanner.nextDouble();
    }

    public void exibirMensagem() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.lerDados();
        conta.exibirMensagem();
    }
}