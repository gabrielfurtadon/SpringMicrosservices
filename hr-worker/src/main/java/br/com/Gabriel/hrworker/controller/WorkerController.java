package br.com.Gabriel.hrworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Gabriel.hrworker.entities.Worker;
import br.com.Gabriel.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

	//OBJ QUE ACESSA O BANCO DE DADOS
	@Autowired //Injeção de dependenciado Spring
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() { //ENCAPSULA UMA RESPOSTA HTTP
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) { //ENCAPSULA UMA RESPOSTA HTTP
		Worker obj = repository.findById(id).get(); //BOTA O .GET PARA ELE PEGAR SEM O OPTIONAL
		return ResponseEntity.ok(obj);
		
	}
	
}
