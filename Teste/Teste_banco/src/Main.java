import java.util.Scanner;

/**
 * Classe principal que contém o método main e o menu interativo para gerenciar usuários e contas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Ver Todos os Usuários");
            System.out.println("3. Buscar Usuário por CPF");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("6. Imprimir Extrato Consolidado");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    try {
                        Usuario usuario = new Usuario(nome, cpf, endereco, telefone);
                        banco.adicionarUsuario(usuario);
                        System.out.println("Usuário e contas adicionados com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao adicionar usuário: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Lista de Usuários:");
                    for (Usuario u : banco.getUsuarios()) {
                        System.out.println(u);
                    }
                    break;
                case 3:
                    System.out.print("CPF: ");
                    String cpfBusca = scanner.nextLine();
                    Usuario usuarioEncontrado = banco.buscarUsuarioPorCpf(cpfBusca);
                    if (usuarioEncontrado != null) {
                        System.out.println("Usuário encontrado: " + usuarioEncontrado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Agência da Conta: ");
                    String agenciaDeposito = scanner.nextLine();
                    System.out.print("Número da Conta: ");
                    String numeroDeposito = scanner.nextLine();
                    System.out.print("Valor do Depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();  // Consome a nova linha
                    Conta contaDeposito = banco.buscarContaPorAgenciaENumero(agenciaDeposito, numeroDeposito);
                    if (contaDeposito != null) {
                        contaDeposito.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 5:
                    System.out.print("Agência da Conta: ");
                    String agenciaSaque = scanner.nextLine();
                    System.out.print("Número da Conta: ");
                    String numeroSaque = scanner.nextLine();
                    System.out.print("Valor do Saque: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();  // Consome a nova linha
                    Conta contaSaque = banco.buscarContaPorAgenciaENumero(agenciaSaque, numeroSaque);
                    if (contaSaque != null) {
                        contaSaque.sacar(valorSaque);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 6:
                    System.out.print("Agência da Conta: ");
                    String agenciaExtrato = scanner.nextLine();
                    System.out.print("Número da Conta Corrente: ");
                    String numeroExtratoCorrente = scanner.nextLine();
                    System.out.print("Número da Conta Poupança: ");
                    String numeroExtratoPoupanca = scanner.nextLine();
                    banco.imprimirExtratoConsolidado(agenciaExtrato, numeroExtratoCorrente, numeroExtratoPoupanca);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
