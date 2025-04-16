package com.guerreiros.cadastro.services;

import org.springframework.stereotype.Service;

import com.guerreiros.cadastro.models.Guerreiro;
import com.guerreiros.cadastro.repositories.GuerreiroRepository;

@Service
public class GuerreiroService {

	private GuerreiroRepository guerreiroRepository;

	public GuerreiroService(GuerreiroRepository guerreiroRepository) {
		this.guerreiroRepository = guerreiroRepository;
	}

	public Guerreiro save(Guerreiro guerreiro) {
		return guerreiroRepository.save(guerreiro);
	}

	public Guerreiro findById(Long id) {
		return guerreiroRepository.findById(id).orElse(null);
	}

}