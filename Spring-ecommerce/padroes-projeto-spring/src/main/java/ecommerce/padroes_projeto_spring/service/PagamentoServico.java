package ecommerce.padroes_projeto_spring.service;

import org.springframework.stereotype.Service;

import ecommerce.padroes_projeto_spring.model.DetalhesPagamento;

@Service
public class PagamentoServico {
    public void processarPagamento(DetalhesPagamento detalhesPagamento) {
        System.out.println("Pagamento processado com o método: " + detalhesPagamento.getMetodoPagamento());
    }
}
