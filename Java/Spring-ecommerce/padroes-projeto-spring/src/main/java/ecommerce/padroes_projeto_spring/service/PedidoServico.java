package ecommerce.padroes_projeto_spring.service;

import org.springframework.stereotype.Service;
import ecommerce.padroes_projeto_spring.model.Pedido;

@Service
public class PedidoServico {
    public void validarPedido(Pedido pedido) {
        System.out.println("Pedido validado.");
    }
}
