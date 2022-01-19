package com.bibliotheque.demo.web;

import java.util.List;

import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToStdout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.demo.dao.BibliothequeRepository;
import com.bibliotheque.demo.entities.Bibliotheque;

@RestController
//@RequestMapping(value="/bibliotheques")
public class ControllerBibliotheque {
	
	@Autowired
	private  BibliothequeRepository bibliorep;

	//edit - modification =  "put" TESTEE = OK 
	@RequestMapping(value="/editbibliotheque/{id}", method = RequestMethod.PUT)
	//@ResponseBody
	public Bibliotheque editBibliotheque(@PathVariable Long id,@RequestBody Bibliotheque b) {
	System.out.println(id);
	
	b.setId(id);
	return bibliorep.save(b);
}
	
	//change - modification un seul element  =  "patch" TESTEE = NE MARCHE PAS 
		//@RequestMapping(value="/changebibliotheque/{id}", method = RequestMethod.PATCH)
		//@ResponseBody
		//public Bibliotheque patchBibliotheque(@PathVariable Long id,@RequestBody Bibliotheque b) {
		//System.out.println(id);
		//return bibliorep.save(b);
	//}
	
	//"get" une seule bibliothèque TESTEE = OK 
	@RequestMapping(value="/getbibliotheque/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Bibliotheque getBibliotheque (@PathVariable("id") Long id) {
	return  bibliorep.findById(id).orElse(null);
	}	
	
	//get plusieures bibliothèques TESTEE = OK 
	@RequestMapping(value="/getbibliotheque", method = RequestMethod.GET)
	@ResponseBody
	public List<Bibliotheque> getBibliotheque(){
	return bibliorep.findAll();
	}
	
	
	//post TESTEE = NE MARCHE PAS 
		//@RequestMapping(value="/savebibliotheque", method = RequestMethod.POST)
		//@ResponseBody
		//public String saveBibliotheque (@RequestBody Bibliotheque b) {
			//return bibliorep.save(b).toString();
			//}
		
		//post TESTEE = OK
		@RequestMapping(value="/savebibliotheque", method = RequestMethod.POST)
		@ResponseBody
		public Bibliotheque saveBibliotheque (@RequestBody Bibliotheque b) {
		return bibliorep.save(b);
		}

		//delete un seul TESTEE = OK
		@RequestMapping(value="/deletebibliotheque/{id}", method = RequestMethod.DELETE)
		@ResponseBody
		//public Bibliotheque deleteBibliotheque (@PathVariable Long id) {
			//bibliorep.deleteById(id);
			//return null;		
		//public ResponseEntity <Boolean> deleteBibliotheque (@PathVariable ("id") int id) {
			//bibliorep.deleteById((long) id);
			//return new ResponseEntity <Boolean>(Boolean.TRUE, HttpStatus.OK);
		public boolean deleteBibliotheque (@PathVariable Long id) {
		bibliorep.deleteById(id);
		return true;
		
		}
		
		//delete  plusieures bibliothèques TESTEE = OK
		@RequestMapping(value="/deletebibliotheque", method = RequestMethod.DELETE)
		@ResponseBody
		//public List<Bibliotheque> deleteBibliotheque(){
		//bibliorep.deleteAll();
		//return null;
		public  boolean  deleteBibliotheque(){
			bibliorep.deleteAll();
			return true;
		//boolean false true 
		}
			
}
		


