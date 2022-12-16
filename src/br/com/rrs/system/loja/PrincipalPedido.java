package br.com.rrs.system.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.rrs.system.loja.pedido.GeraPedido;
import br.com.rrs.system.loja.pedido.GeraPedidoHandler;
import br.com.rrs.system.loja.pedido.acoes.EnviarEmailPedido;
import br.com.rrs.system.loja.pedido.acoes.LogDePedido;
import br.com.rrs.system.loja.pedido.acoes.SalvarPedidoNoBancoDeDados;

public class PrincipalPedido {

	public static void main(String[] args) {
		String cliente = "Kamilly K";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new SalvarPedidoNoBancoDeDados(),
				new EnviarEmailPedido(),
				new LogDePedido()
		));
		handler.execute(gerador);
	}

}
