package ecommerce.padroes_projeto_spring.service;

import org.springframework.stereotype.Service;

import ecommerce.padroes_projeto_spring.model.Pedido;

@Service
public class EnvioServico {
    public void atualizarInventario(Pedido pedido) {
        System.out.println("Inventário atualizado");
    }

    public void enviarPedido(Pedido pedido) {
        System.out.println("Pedido enviado.");
    }
}

