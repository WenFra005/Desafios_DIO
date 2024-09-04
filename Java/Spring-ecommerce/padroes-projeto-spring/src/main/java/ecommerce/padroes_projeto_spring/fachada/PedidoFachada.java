package ecommerce.padroes_projeto_spring.fachada;

import org.springframework.stereotype.Service;

import ecommerce.padroes_projeto_spring.model.Pedido;
import ecommerce.padroes_projeto_spring.service.EnvioServico;
import ecommerce.padroes_projeto_spring.service.PagamentoServico;
import ecommerce.padroes_projeto_spring.service.PedidoServico;

@Service
public class PedidoFachada {
    
    private final PedidoServico pedidoServico;
    private final PagamentoServico pagamentoServico;
    private final EnvioServico envioServico;

    public PedidoFachada(PedidoServico pedidoServico, PagamentoServico pagamentoServico, EnvioServico envioServico) {
        this.pedidoServico = pedidoServico;
        this.pagamentoServico = pagamentoServico;
        this.envioServico = envioServico;
    }

    public void completarPedido(Pedido pedido) {
        pedidoServico.validarPedido(pedido);
        pagamentoServico.processarPagamento(pedido.getDetalhesPagamento());
        envioServico.atualizarInventario(pedido);
        envioServico.enviarPedido(pedido);
        System.out.println("Pedido concluído com sucesso.");
    }
}
