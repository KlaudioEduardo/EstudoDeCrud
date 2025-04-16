package com.guerreiros.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guerreiros.cadastro.models.Guerreiro;

@Repository
public interface GuerreiroRepository extends JpaRepository<Guerreiro, Long>{

}
