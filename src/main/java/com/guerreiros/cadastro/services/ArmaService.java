package com.guerreiros.cadastro.services;

import com.guerreiros.cadastro.models.Arma;
import com.guerreiros.cadastro.repositories.ArmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    private final ArmaRepository armaRepository;

    public ArmaService(ArmaRepository armaRepository) {
        this.armaRepository = armaRepository;
    }

    public void save(Arma arma) {
        armaRepository.save(arma);
    }

    public Arma findById(Long id) {
        return armaRepository.findById(id).orElse(null);
    }

    public List<Arma> findAll() {
        return armaRepository.findAll();
    }

    public void deleteById(Long id) {
        armaRepository.deleteById(id);
    }
}
