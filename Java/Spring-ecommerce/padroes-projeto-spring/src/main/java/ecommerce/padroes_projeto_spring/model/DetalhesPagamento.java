package ecommerce.padroes_projeto_spring.model;

public class DetalhesPagamento {

    private String metodoPagamento;
    private String numeroCartao;
    
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    

}
