package br.com.rrs.system.loja.desconto;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalcular(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalcular(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
