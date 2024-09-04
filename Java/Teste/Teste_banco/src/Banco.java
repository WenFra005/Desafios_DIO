import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um banco e gerencia uma lista de usuários e contas.
 */
public class Banco {
    private List<Usuario> usuarios;
    private List<Conta> contas;
    private static final String AGENCIA_PADRAO = "0001";
    private int contadorContas = 1;

    /**
     * Construtor que inicializa as listas de usuários e contas.
     */
    public Banco() {
        this.usuarios = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    /**
     * Método para adicionar um usuário à lista e criar contas associadas.
     * @param usuario O usuário a ser adicionado
     */
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        String numeroContaCorrente = String.valueOf(contadorContas++);
        String numeroContaPoupanca = String.valueOf(contadorContas++);

        ContaCorrente cc = new ContaCorrente(AGENCIA_PADRAO, numeroContaCorrente, 1000.0);
        ContaPoupanca cp = new ContaPoupanca(AGENCIA_PADRAO, numeroContaPoupanca);

        this.contas.add(cc);
        this.contas.add(cp);

        System.out.println("Contas Corrente e Poupança criadas com sucesso para o usuário " + usuario.getNome() + ".");
        System.out.println("Número da Conta Corrente: " + numeroContaCorrente);
        System.out.println("Número da Conta Poupança: " + numeroContaPoupanca);
    }

    /**
     * Método para obter a lista de todos os usuários.
     * @return Lista de usuários
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Método para buscar um usuário pelo CPF.
     * @param cpf CPF do usuário a ser buscado
     * @return O usuário encontrado ou null se não encontrado
     */
    public Usuario buscarUsuarioPorCpf(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * Método para buscar uma conta pelo número e agência.
     * @param agencia Agência da conta a ser buscada
     * @param numero Número da conta a ser buscada
     * @return A conta encontrada ou null se não encontrada
     */
    public Conta buscarContaPorAgenciaENumero(String agencia, String numero) {
        for (Conta conta : contas) {
            if (conta.getAgencia().equals(agencia) && conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    /**
     * Método para imprimir o extrato consolidado das contas corrente e poupança de um usuário.
     * @param agencia Agência das contas
     * @param numeroCorrente Número da conta corrente
     * @param numeroPoupanca Número da conta poupança
     */
    public void imprimirExtratoConsolidado(String agencia, String numeroCorrente, String numeroPoupanca) {
        Conta contaCorrente = buscarContaPorAgenciaENumero(agencia, numeroCorrente);
        Conta contaPoupanca = buscarContaPorAgenciaENumero(agencia, numeroPoupanca);

        if (contaCorrente == null || contaPoupanca == null) {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
            return;
        }

        System.out.println("Extrato Consolidado:");
        System.out.println("Conta Corrente:");
        contaCorrente.imprimirExtrato();
        System.out.println("Conta Poupança:");
        contaPoupanca.imprimirExtrato();
    }
}
