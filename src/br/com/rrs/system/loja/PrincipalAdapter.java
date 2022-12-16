package br.com.rrs.system.loja;

import java.math.BigDecimal;

import br.com.rrs.system.loja.http.JavaHttpClient;
import br.com.rrs.system.loja.orcamento.ItemOrcamento;
import br.com.rrs.system.loja.orcamento.Orcamento;
import br.com.rrs.system.loja.orcamento.RegistroDeOrcamento;

public class PrincipalAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));		
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
