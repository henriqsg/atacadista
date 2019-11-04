package com.puc.arquitetura.atacadista.service;

import com.puc.arquitetura.atacadista.domain.Orcamento;
import com.puc.arquitetura.atacadista.domain.Pedido;
import com.puc.arquitetura.atacadista.service.exception.PedidoNotFound;

import java.util.List;

public interface PedidoService {

    String getStatus(Long id) throws PedidoNotFound;

    Pedido createPedido(Long id, Integer codigoProduto, Integer quantidade, String observacoes);

    List<Pedido> all();

    Pedido authorize(boolean autorizar);
}
