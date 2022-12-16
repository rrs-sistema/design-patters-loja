package br.com.rrs.system.loja.orcamento.situacao;

import br.com.rrs.system.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
