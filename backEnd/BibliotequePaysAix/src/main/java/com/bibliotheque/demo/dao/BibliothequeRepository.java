// le package de l'interface termine par .dao = comme la partie service chez angular c'est toute les requêtes http
//chaque table / class / entité doit avoir sa propre interface JPA


package com.bibliotheque.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.bibliotheque.demo.entities.Bibliotheque;
import com.bibliotheque.demo.entities.Livre;


//la table Bibliotheque aura une interface qui a le même nom suivi si l'on veut par Repository je dois ensuite
//rajouter le mot extends suivi par JpaRepository. 
//L'interface est une classe abstraite donc on ne peut pas les instancier. 
//JpaRepository nous demande ensuite de renseigner la table liée à l'interface et le type de son ID
//Grace à on accède au requetes mises à disposition par JPA = CRUD 


//annotation @CrossOrigin pour lier Spring Boot au port du projet Angular => l'url doit être entre parenthèses 

//@CrossOrigin("http://localhost:4200/")
@CrossOrigin("*")

//annotation @RestController permet d'afficher mes informations en format API

@RestController
public interface BibliothequeRepository extends JpaRepository<Bibliotheque, Long>{
	
	
@RestResource (path = "/ByName")
public List<Bibliotheque> findByNomContains(@Param("toto") String mlrT);

@RestResource (path = "ByNombreAdherants")
public List<Bibliotheque> findByNombreAdherantsBetween(@Param("minAdh") int minAdh, @Param("maxAdh") int maxAdh);
	
	

}
