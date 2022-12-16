package br.com.rrs.system.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.rrs.system.loja.orcamento.ItemOrcamento;
import br.com.rrs.system.loja.orcamento.Orcamento;
import br.com.rrs.system.loja.pedido.acoes.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
