package br.com.rrs.system.loja.desconto;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDesconto = new DescontoOrcamentoPorItens(new DescontoOrcamentoPorValor(new SemDesconto()));

		return cadeiaDeDesconto.calcular(orcamento);
	}
}
