package com.bibliotheque.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.demo.entities.Bibliotheque;
import com.bibliotheque.demo.entities.Livre;



@CrossOrigin("*")
@RestController
public interface LivreRepository extends JpaRepository<Livre, Long> {
	
	
		
		
	@RestResource (path = "ByCodeISBN")
	public List<Livre> findByCodeIsbnBetween(@Param("minCode") int minCode, @Param("maxCode") int maxCode );
		
		

}
