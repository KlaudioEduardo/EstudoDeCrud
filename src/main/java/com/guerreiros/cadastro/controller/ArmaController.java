package com.guerreiros.cadastro.controller;

import com.guerreiros.cadastro.models.Arma;
import com.guerreiros.cadastro.services.ArmaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/armas")
public class ArmaController {

    private final ArmaService armaService;

    public ArmaController(ArmaService armaService) {
        this.armaService = armaService;
    }

    @PostMapping
    public ResponseEntity<Void> novaArma(@RequestBody Arma arma) {
        armaService.save(arma);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Arma> buscarPorId(@PathVariable Long id) {
        Arma arma = armaService.findById(id);
        if (arma == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(arma);
    }

    @GetMapping
    public ResponseEntity<List<Arma>> listarTodas() {
        return ResponseEntity.ok(armaService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        armaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Long id, @RequestBody Arma armaAtualizada) {
        armaAtualizada.setId(id);
        armaService.save(armaAtualizada);
        return ResponseEntity.noContent().build();
    }
}
