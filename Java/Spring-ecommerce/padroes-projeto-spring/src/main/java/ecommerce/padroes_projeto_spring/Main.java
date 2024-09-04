package ecommerce.padroes_projeto_spring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ecommerce.padroes_projeto_spring.config.AppConfig;
import ecommerce.padroes_projeto_spring.fachada.PedidoFachada;
import ecommerce.padroes_projeto_spring.model.DetalhesPagamento;
import ecommerce.padroes_projeto_spring.model.Pedido;
import ecommerce.padroes_projeto_spring.model.Produto;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
        
        PedidoFachada pedidoFachada = context.getBean(PedidoFachada.class);

        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setPreco(1209.99);

        Produto produto2 = new Produto();
        produto2.setNome("Mouse");
        produto2.setPreco(39.99);

        Produto produto3 = new Produto();
        produto3.setNome("Mousepad pequeno");
        produto3.setPreco(20.39);

        DetalhesPagamento detalhesPagamento = new DetalhesPagamento();
        detalhesPagamento.setMetodoPagamento("Cartão de crédito");
        detalhesPagamento.setNumeroCartao("1234-5678-9876-5643");

        Pedido pedido = new Pedido();
        pedido.setProdutos(Arrays.asList(produto1, produto2, produto3));
        pedido.setDetalhesPagamento(detalhesPagamento);

        pedidoFachada.completarPedido(pedido);

        context.close();

    }

}
