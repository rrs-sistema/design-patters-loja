package br.com.rrs.system.loja;

import java.math.BigDecimal;

import br.com.rrs.system.loja.imposto.CalculadoraDeImpostos;
import br.com.rrs.system.loja.imposto.ICMS;
import br.com.rrs.system.loja.imposto.ISS;
import br.com.rrs.system.loja.orcamento.ItemOrcamento;
import br.com.rrs.system.loja.orcamento.Orcamento;

// 	Para saber mais: Strategy --> https://refactoring.guru/design-patterns/strategy
// 	O livro Padrões de Projeto - Soluções reutilizáveis de software orientado a objetos é um 
//	catálogo para todos estes padrões, com todas as explicações necessárias.

public class PrincipalImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println("Imposto --> " + calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}
}
