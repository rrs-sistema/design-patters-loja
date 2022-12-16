package br.com.rrs.system.loja.pedido.acoes;

import br.com.rrs.system.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados!");
	}
	
}
