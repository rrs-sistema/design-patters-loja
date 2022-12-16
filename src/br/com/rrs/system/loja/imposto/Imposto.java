package br.com.rrs.system.loja.imposto;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	private Imposto outro;
	
	public Imposto(Imposto outro) {
		this.outro = outro;
	}
	
	public abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImpost = realizarCalculo(orcamento);
		
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		if(outro != null) {
			valorOutroImposto = outro.realizarCalculo(orcamento);
		}
		
		return valorImpost.add(valorOutroImposto);
	}
	
}
