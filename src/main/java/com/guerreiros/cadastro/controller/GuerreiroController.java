package com.guerreiros.cadastro.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guerreiros.cadastro.models.Guerreiro;
import com.guerreiros.cadastro.repositories.GuerreiroRepository;
import com.guerreiros.cadastro.services.GuerreiroService;

@RestController
@RequestMapping("/guerreiros")
public class GuerreiroController {

	private final GuerreiroService guerreiroService;

	private final GuerreiroRepository guerreiroRepository;

	public GuerreiroController(GuerreiroService guerreiroService, GuerreiroRepository guerreiroRepository) {
		this.guerreiroService = guerreiroService;
		this.guerreiroRepository = guerreiroRepository;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Guerreiro> findById(@PathVariable Long id) {
		Guerreiro guerreiroEncontrado = guerreiroService.findById(id);
		
		if(guerreiroEncontrado == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(guerreiroService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Void> novoGuerreiro(@RequestBody Guerreiro guerreiro) {
		guerreiroService.save(guerreiro);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/todos")
	public ResponseEntity<List<Guerreiro>> findAll() {
		return ResponseEntity.ok().body(guerreiroRepository.findAll());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		guerreiroRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> atualizarGuerreiro(@PathVariable Long id, @RequestBody Guerreiro novoGuerreiro) {
		novoGuerreiro.setId(id);
		guerreiroRepository.save(novoGuerreiro);
		return ResponseEntity.noContent().build();
	}

}
