package com.bibliotheque.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bibliotheque.demo.dao.LivreRepository;

import com.bibliotheque.demo.entities.Livre;



public class ControllerLivre {


	@Autowired
	private  LivreRepository livrerep;
	
	
	//"get" un seul livre TESTEE = OK 
		@RequestMapping(value="/getlivre/{id}", method = RequestMethod.GET)
		@ResponseBody
		public Livre getLivre (@PathVariable("id") Long id) {
		return livrerep.findById(id).orElse(null);
		}	
		
		//get plusieures bibliothèques TESTEE = OK 
		@RequestMapping(value="/getlivre", method = RequestMethod.GET)
		@ResponseBody
		public List<Livre> getBibliotheque(){
		return livrerep.findAll();
		}
	
}
