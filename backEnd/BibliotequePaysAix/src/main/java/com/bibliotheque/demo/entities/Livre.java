package com.bibliotheque.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String image;
	private String nomLivre;
	private String nomAuteur;
	@Column(length=512) // preciser le numero de caracteres en cas de texte assez long 
	private String  description;
	private int codeIsbn;
	
	@ManyToOne 
	private Bibliotheque biblio;
	
	public Livre(Long id, String image, String nomLivre, String nomAuteur, String description, int codeIsbn,
			Bibliotheque biblio) {
		super();
		this.id = id;
		this.image = image;
		this.nomLivre = nomLivre;
		this.nomAuteur = nomAuteur;
		this.description = description;
		this.codeIsbn = codeIsbn;
		this.biblio = biblio;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNomLivre() {
		return nomLivre;
	}

	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCodeIsbn() {
		return codeIsbn;
	}

	public void setCodeIsbn(int codeIsbn) {
		this.codeIsbn = codeIsbn;
	}

	public Bibliotheque getBiblio() {
		return biblio;
	}

	public void setBiblio(Bibliotheque biblio) {
		this.biblio = biblio;
	}

	

	
	
	


	
	

}
