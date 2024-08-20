import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();
    System.out.print("Digite o seu nome: ");
    String nome = scanner.nextLine();
    contaTerminal.setNome(nome);

    System.out.println("Olá " + contaTerminal.getNome() + ". Sua conta foi criada com sucesso");
    System.out.println("Sua agencia é " + contaTerminal.getAgencia() + " e o numero é " + contaTerminal.getNumero());
    System.out.println("Seu de R$ " + contaTerminal.getSaldo() + " já foi liberado.");
    }
    

}
