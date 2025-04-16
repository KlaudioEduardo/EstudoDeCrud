package com.guerreiros.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guerreiros.cadastro.models.Arma;

@Repository
public interface ArmaRepository extends JpaRepository<Arma, Long> {
	

}
