package com.guerreiros.cadastro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "arma")
public class Arma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String tipo;
	private Long startrack;
	private String porte;
	
	
	public Arma(Long id, String tipo, Long startrack, String porte) {
		this.id = id;
		this.tipo = tipo;
		this.startrack = startrack;
		this.porte = porte;
	}
	
	public Arma() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getStartrack() {
		return startrack;
	}

	public void setStartrack(Long startrack) {
		this.startrack = startrack;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	

}
