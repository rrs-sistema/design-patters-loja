package br.com.rrs.system.loja;

import java.math.BigDecimal;

import br.com.rrs.system.loja.orcamento.ItemOrcamento;
import br.com.rrs.system.loja.orcamento.Orcamento;

public class PrincipalComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);		
		
		System.out.println(novo.getValor());
	}

}
