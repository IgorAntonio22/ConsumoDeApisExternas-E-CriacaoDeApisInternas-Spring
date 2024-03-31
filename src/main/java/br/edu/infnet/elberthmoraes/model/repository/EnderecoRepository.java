package br.edu.infnet.elberthmoraes.model.repository;

import org.springframework.data.repository.CrudRepository; //responsável por realizar todo o SQL a partir do código (Spring data)
import org.springframework.stereotype.Repository;

import br.edu.infnet.elberthmoraes.model.domain.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> { 
	//T = Entidade que você quer tratar dentro de EnderecoRepository 
	//ID quer uma classe Wrapper e não um tipo de variável, por isso colocamos Integer no id na entidade que é a 
	//primary key da tabela.
	//dentro dessa interface nós já temos vários extends com opções de CRUDS, clicar nela para ver mais
	
	
	
}
