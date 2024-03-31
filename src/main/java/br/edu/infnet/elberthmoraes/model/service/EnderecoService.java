package br.edu.infnet.elberthmoraes.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthmoraes.model.domain.Endereco;
import br.edu.infnet.elberthmoraes.model.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository; //disponibiliza todos os métodos de CRUD 
	
	public void incluir(Endereco endereco) {
		enderecoRepository.save(endereco);	
	}
	
	public void excluir(Integer id) {
		enderecoRepository.deleteById(id);
	}
	
	public Collection<Endereco> obterLista(){
		return (Collection<Endereco>) enderecoRepository.findAll();
	}
	
	public Endereco obter(Integer id){
		return enderecoRepository.findById(id).orElse(null); //se não recuperar nada <Optional> retorne um nulo no lugar.
	}
}