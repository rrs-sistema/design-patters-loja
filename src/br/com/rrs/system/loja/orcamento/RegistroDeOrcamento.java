package br.com.rrs.system.loja.orcamento;

import java.util.Map;

import br.com.rrs.system.loja.DomainException;
import br.com.rrs.system.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

	private HttpAdapter http;
	private String url = "http://api.externa/orcamento";

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		
		if (!orcamento.isFinalizado()) {
			throw new  DomainException("Orcamento não finalizado");
		}
		
		Map<String, Object> dados = Map.of("valor", orcamento.getQuantidadeItens(), "quantidadeItens",
				orcamento.getValor(), "situacao", orcamento.getSituacao());

		http.post(this.url, dados);
	}
}
