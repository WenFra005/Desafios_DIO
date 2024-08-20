public class ContaTerminal {

    private String nome;
    private String agencia = "9500";
    private int numero = 0110;
    private double saldo = 50.00;

    public ContaTerminal(String nome, String agencia, int numero, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    public ContaTerminal() {
        //TODO Auto-generated constructor stub
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
