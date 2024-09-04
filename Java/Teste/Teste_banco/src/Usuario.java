public class Usuario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Usuario(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = formatarCpf(cpf);
        this.endereco = endereco;
        this.telefone = formatarTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Telefone: " + telefone;
    }

    private String formatarCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }

    private String formatarTelefone(String telefone) {
        if (telefone == null || telefone.length() != 11) {
            throw new IllegalArgumentException("Telefone inválido. Deve conter 11 dígitos");
        }
        return telefone.substring(0, 0) + "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 7) + " - " + telefone.substring(7, 11);
    }
}
