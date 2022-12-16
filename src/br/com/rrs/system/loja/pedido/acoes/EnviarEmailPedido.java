package br.com.rrs.system.loja.pedido.acoes;

import br.com.rrs.system.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido!");
	}

	
}
