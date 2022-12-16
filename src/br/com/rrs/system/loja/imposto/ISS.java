package br.com.rrs.system.loja.imposto;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}

	@Override
	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
