package br.com.rrs.system.loja.pedido.acoes;

import br.com.rrs.system.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido foi gerado: " + pedido);
	}
	
}
