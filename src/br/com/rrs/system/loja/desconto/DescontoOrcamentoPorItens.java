package br.com.rrs.system.loja.desconto;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.Orcamento;

public class DescontoOrcamentoPorItens extends Desconto {
	
	public DescontoOrcamentoPorItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
	
}
