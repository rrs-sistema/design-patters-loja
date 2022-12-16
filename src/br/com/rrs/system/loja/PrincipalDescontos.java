package br.com.rrs.system.loja;

import java.math.BigDecimal;

import br.com.rrs.system.loja.desconto.CalculadoraDeDescontos;
import br.com.rrs.system.loja.orcamento.ItemOrcamento;
import br.com.rrs.system.loja.orcamento.Orcamento;

// 	Para saber mais: Chain of Responsibility --> https://refactoring.guru/design-patterns/chain-of-responsibility.
// 	Assim como qualquer outro conceito em computação,  
//	existe mais de uma forma de implementar o padrão de projeto Chain of Responsibility.

public class PrincipalDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		Orcamento terceiro = new Orcamento();
		terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println("Descontos por itens --> " + calculadora.calcular(primeiro));
		System.out.println("Descontos por valor --> " + calculadora.calcular(segundo));
		System.out.println("Descontos por valor --> " + calculadora.calcular(terceiro));
	}
}
