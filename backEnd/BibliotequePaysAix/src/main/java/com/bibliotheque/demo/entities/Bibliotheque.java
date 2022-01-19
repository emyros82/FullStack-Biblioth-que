// package .entities

package com.bibliotheque.demo.entities;



import java.util.Collection;

import javax.persistence.Column;

//importations

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



//@Entity annotation pour la table / class Bibliotheque qui doit avoir la première lettre en Majuscule 
//et au singulier pour pouvoir après donner le chemin à suivre pour afficher les API /Bibliotheques

@Entity
public class Bibliotheque {
	
//association les attribus de la table à la clé primaire @Id =  annotation
//demander la generation automatique de la clé primaire à traver l'annotation @GenerateValue
// les attribus de ma table doivent être déclarés mais sans leur valeur correspondante parce qu'ils
//seront alimentés par la base de données. Dans la classe /table/ entité on déclare juste les attribus
//dont on a besoin pour construire notre base de données. 
//L'affichage est possible parce que dans la table Bibliotheque nous avons inseré les annotation @Id et @GenerateValue
//Si on enlève ces 2 annotations rien va s'afficher et j'aurais l'erreur : no identify specified for entity

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String image;
private String nom;
@Column(length=512) // preciser le numero de caracteres en cas de texte assez long 
private String  description;
private String adresse;
private String telephone;
private String horaire;
private String contact;
private String siteWeb;
private int nombreAdherants;

@OneToMany (mappedBy="biblio")
private Collection<Livre> livres;








//Création du CONSTRUCTEUR avec attribus

public Bibliotheque(Long id, String image, String nom, String description, String adresse, String telephone,
		String horaire, String contact, String siteWeb, int nombreAdherants, Collection<Livre> livres) {
	super();
	this.id = id;
	this.image = image;
	this.nom = nom;
	this.description = description;
	this.adresse = adresse;
	this.telephone = telephone;
	this.horaire = horaire;
	this.contact = contact;
	this.siteWeb = siteWeb;
	this.nombreAdherants = nombreAdherants;
	this.livres = livres;
}






//Création du deuxième CONSTRUCTEUR cette fois sans attribus 



public Bibliotheque() {
	super();
	// TODO Auto-generated constructor stub
}









//Création des méthodes get et set avec attribus




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






public String getNom() {
	return nom;
}






public void setNom(String nom) {
	this.nom = nom;
}






public String getDescription() {
	return description;
}






public void setDescription(String description) {
	this.description = description;
}






public String getAdresse() {
	return adresse;
}






public void setAdresse(String adresse) {
	this.adresse = adresse;
}






public String getTelephone() {
	return telephone;
}






public void setTelephone(String telephone) {
	this.telephone = telephone;
}






public String getHoraire() {
	return horaire;
}






public void setHoraire(String horaire) {
	this.horaire = horaire;
}






public String getContact() {
	return contact;
}






public void setContact(String contact) {
	this.contact = contact;
}






public String getSiteWeb() {
	return siteWeb;
}






public void setSiteWeb(String siteWeb) {
	this.siteWeb = siteWeb;
}






public int getNombreAdherants() {
	return nombreAdherants;
}






public void setNombreAdherants(int nombreAdherants) {
	this.nombreAdherants = nombreAdherants;
}






public Collection<Livre> getLivres() {
	return livres;
}






public void setLivres(Collection<Livre> livres) {
	this.livres = livres;
}






}