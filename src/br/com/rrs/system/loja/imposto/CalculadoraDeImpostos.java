package br.com.rrs.system.loja.imposto;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto) {
		return tipoImposto.calcular(orcamento);
	}
}
