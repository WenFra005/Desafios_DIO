import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected String agencia;
    protected String numero;
    protected double saldo;
    protected List<String> extrato;

    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        extrato.add("Depósito de R$ " + valor + " Saldo: R$ " + saldo);
    }

    public abstract void sacar(double valor);

    public void imprimirExtrato() {
        System.out.println("===Extrato da Conta " + agencia + "-" + numero +"===");
        for (String registro : extrato) {
            System.out.println(registro);
        }
        System.out.println("Saldo Atual: R$ " + saldo);
    }
}
