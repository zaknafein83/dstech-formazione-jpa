package it.dstech.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	
	private String cognome;
	 
	@OneToMany
	private List<Libro> libri;
	
	public Persona() {
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

}
