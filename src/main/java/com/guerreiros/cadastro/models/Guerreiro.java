package com.guerreiros.cadastro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "guerreiro")
public class Guerreiro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String nacionalidade;
	private Integer kills;
	
	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Guerreiro(Long id, String nome, String nacionalidade, Integer kills, Arma arma) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.kills = kills;
		this.arma = arma;
	}

	public Integer getKills() {
		return kills;
	}

	public void setKills(Integer kills) {
		this.kills = kills;
	}

	@OneToOne
	private Arma arma;
	

	public Guerreiro(Long id, String nome, Arma arma) {
		
		this.id = id;
		this.nome = nome;
		this.arma = arma;
	}
	
	public Guerreiro() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
}
