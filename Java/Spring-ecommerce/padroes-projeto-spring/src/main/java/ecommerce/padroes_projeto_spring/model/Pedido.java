package ecommerce.padroes_projeto_spring.model;

import java.util.List;

public class Pedido {

    private List<Produto> produtos;
    private DetalhesPagamento detalhesPagamento;
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public DetalhesPagamento getDetalhesPagamento() {
        return detalhesPagamento;
    }
    public void setDetalhesPagamento(DetalhesPagamento detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    
        

}
