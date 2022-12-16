package br.com.rrs.system.loja.desconto;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.Orcamento;

public class DescontoOrcamentoPorValor extends Desconto {
	
	public DescontoOrcamentoPorValor(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
	
}
