package br.edu.infnet.elberthmoraes.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.elberthmoraes.model.domain.Professor;
import br.edu.infnet.elberthmoraes.model.service.ProfessorService;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	//Em uma aplicação Spring Boot (ou em qualquer aplicação que utilize o Spring Framework), 
	//o @RequestBody é uma anotação utilizada em métodos de controladores (Controllers) para 
	//indicar que o corpo da solicitação HTTP deve ser mapeado para um objeto específico. 
	//Geralmente, é usado em operações de inclusão (POST) ou atualização (PUT) onde os dados são 
	//enviados no corpo da solicitação HTTP, geralmente em formato JSON ou XML.
	
	//Neste exemplo, a anotação @RequestBody indica que os dados enviados no corpo da solicitação
	//HTTP devem ser mapeados para um objeto Professor, que é passado como argumento para o método 
	//incluirUsuario. O Spring irá desserializar automaticamente os dados enviados pelo cliente no
	//formato especificado (por exemplo, JSON) para um objeto Professor, o que permite que você 
	//trabalhe com ele dentro do método do controlador.
	
	//Sem o @RequestBody, você teria que extrair os dados manualmente do corpo da solicitação HTTP, 
	//o que seria mais complicado e propenso a erros. O uso de @RequestBody simplifica bastante o 
	//processo de tratamento de dados enviados pelos clientes em solicitações HTTP.
	
	
	
	
	//Ou seja, o @RequestBody já pega somente o corpo da requisição HTTP realizada pelo cliente/Postman
	//e converte esse corpo de formato JSON para o formato do Objeto que você definiu na inclusão
	//fazendo assim com que você não tenha que destrinchar a requisição http e trazer somente os dados
	//do corpo da requisição HTTP manualmente
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Professor professor) {
		professorService.incluir(professor);
	}
	
	@DeleteMapping(value = "/{registro}/excluir")
	public void excluir(@PathVariable int registro) {
		professorService.excluir(registro);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Professor> obterLista(){
		return professorService.obterLista();
	}
	
	@GetMapping(value = "/{registro}/listar")
	public Professor obter(@PathVariable int registro){
		return professorService.obter(registro);
	}	
}