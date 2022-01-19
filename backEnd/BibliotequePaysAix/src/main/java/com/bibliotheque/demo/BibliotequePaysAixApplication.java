
// Il s'agit du package contenant mon fichier MAIN
package com.bibliotheque.demo;


import java.util.Random;

import javax.persistence.Column;

//imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.bibliotheque.demo.dao.BibliothequeRepository;
import com.bibliotheque.demo.dao.LivreRepository;
import com.bibliotheque.demo.entities.Bibliotheque;
import com.bibliotheque.demo.entities.Livre;

import net.bytebuddy.utility.RandomString;






//cette annotation est créée automatiquement par spring boot
@SpringBootApplication


//il faut mnt travailler sur la class en rajoutant le mot clé implements suivi par CommandLineRunner
//CommandLineRunner est une interface qui nous est fournie par Spring Boot, c'est pas nous qui on l'a définie 
//l'interface CommandLineRunner contient une seule méthode que c'est RUN qu'on peut @Override
//ca permet le démarrage de mon application 
//ensuite il faut clicker sur le nom de ma classe pour créer la méthode @Override RUN

public class BibliotequePaysAixApplication implements CommandLineRunner{
	
	
//Injection de dependance => il faut lier mon interface BibliothequeRepository avec le fichier MAIN
// pour le faire je dois déjà  inserer l'annotation @Autowired = sert à lire ma variable locale liée à mon fichier 
// faire l'injection de dependence sans le new sur spring boot private EmployeeRepository er;
// BibliothequeRepository  = interface / br = ma variable locale liée à mon interface qui communique avec le JPA
// il faudra penser à importer mon interface 
		// 
		
		@Autowired
		private  BibliothequeRepository br; //injection de dependence
		
		@Autowired
		private LivreRepository lr;
		
		@Autowired
		private RepositoryRestConfiguration rrc;
		
		//@Autowired 
		//private RepositoryRestConfiguration repositoryRestConfiguration; 

	public static void main(String[] args) {
		SpringApplication.run(BibliotequePaysAixApplication.class, args);
	}

	
//méthode RUN créée par le nom de ma classe MAIN
// l'interface CommandLineRunner contient une seule méthode que c'est RUN qu'on peut @Override
//ca permet le démarrage de mon application 
//ensuite il faut clicker sur le nom de ma classe pour créer la méthode @Override RUN
	
	@Override
	public void run(String... args) throws Exception {
		//repositoryRestConfiguration.exposeIdsFor(Bibliotheque.class);
		
		//exposer l'ID

	rrc.exposeIdsFor(Bibliotheque.class, Livre.class);
//j'ai fait juste un syso pour voir si mon application marche au lancement de la console 
		
		System.out.println("coucou");
		
//c'est dans la méthode run que je vais inserer les requêtes 
// je fais appel à ma variable locale er avec le point j'ai accès à plusieurs méthodes/attribus/requêtes
// on choisi la requête save et on la définie :
// première chose on va lui dire que elle va enrichir la table Employe en rajoutant le mot clé new
// ensuite on va definir toutes les valeurs de nos attribus laissés vides dans la table correspondante
		
		
		  br.save(new Bibliotheque (null,
		  "https://www.aixenprovence.fr/local/cache-gd2/a5/20bd008f32f9015e71da76efda06dc.jpg?1583329035",
		  "Bibliothèque Méjanes-Allumettes",
		  "Dans une ancienne manufacture d’allumettes réhabilitée, 9 000 m² sont dédiés aux collections pour enfants et adultes  mais aussi à la détente et à la convivialité."
		  , "8-10 rue des Allumettes 13100 Aix-en-Provence","06 48 87 17 47",
		  "Du mardi au samedi de 10h à 19h","citedulivre@mairie-aixenprovence.fr",
		  "http://www.citedulivre-aix.com", 140, null));
		  
		  
		  
		  br.save(new Bibliotheque (null,
		  "https://www.aixenprovence.fr/local/cache-gd2/40/c023ce33c8bf1218315f89810c1019.jpg?1529676920",
		  "Les Méjanes numériques - la bibliothèque en ligne",
		  "La bibliothèque en ligne Les Méjanes numériques donne accès à de nombreuses ressources numériques gratuites, depuis un ordinateur, une tablette ou un smartphone."
		  , "N'importe où dans le monde, il suffit une connexion internet!", "06 48 87 17 47",
		  "Les Méjanes numériques, votre bibliothèque en ligne 24h/24 et 7j/7 !"
		  ,"citedulivre@mairie-aixenprovence.fr",
		  "http://numerique.citedulivre-aix.com/", 151, null ));
		  
		  
		  
		  br.save(new Bibliotheque (null,
		  "https://www.aixenprovence.fr/local/cache-gd2/7c/233825cc19a88ad9ef315b84410580.jpg?1582270756",
		  "Bibliothèque et archives Méjanes - Michel Vovelle",
		  "Les fonds patrimoniaux de la bibliothèque Méjanes et les archives municipales d’Aix-en-Provence ont investi depuis février 2020 un nouveau lieu au sein du forum culturel."
		  , "25, allée de Philadelphie – 13100 Aix-en-Provence", "06 48 87 17 47",
		  "Du mardi au vendredi : salle de lecture et exposition : 13-18h\n" +
		  "Samedi : salle de lecture : 13-18h, salle d’exposition : 10-18h\n" +
		  "Samedi : consultation des documents des archives sur demande uniquement."
		  ,"archiv@mairie-aixenprovence.fr","http://aix.arkotheque.fr/" , 120, null));
		  
		  
		  
		  br.save(new Bibliotheque (null,
		  "https://www.aixenprovence.fr/local/cache-gd2/92/d6fd8dc3038ceeda4dd133f75d0a12.jpg?1583332196",
		  "Bibliothèque Méjanes - Halle aux grains",
		  "Dans le bâtiment historique de la Halle aux Grains, place de l’Hôtel de Ville, des collections tous supports pour enfants et adultes, mais aussi des espaces de détente, une programmation culturelle variée."
		  , "Place de l’Hôtel de Ville 13100 Aix-en-Provence", "06 48 87 17 47",
		  "Mardi, jeudi, samedi : 9h-13h / 14h-18h\n" +
		  "Mercredi, vendredi : 14h-18h","citedulivre@mairie-aixenprovence.fr",
		  "http://www.citedulivre-aix.com", 80, null ));
		  
		  
		  br.save(new Bibliotheque (null,
		  "https://www.aixenprovence.fr/local/cache-gd2/ad/875ecabb9c515fe3283dfb00df5f7d.jpg?1529675941",
		  "Bibliothèque Méjanes -Li Campaneto",
		  "Depuis janvier 2014, au cœur du village des Milles, des collections tous supports (livres, presse, CD, DVD) pour enfants et adultes, mais aussi des espaces de détente."
		  , "7 rue de l’église - Les Milles\n" + "13290 Aix-en-Provence", "06 48 87 17 47",
		  "Mardi, vendredi : 14h-18h\n" +
		  "Mercredi, samedi : 10h-13h / 14h-18h","citedulivre@mairie-aixenprovence.fr",
		  "http://www.citedulivre-aix.com",40, null));
		  
		  br.save(new Bibliotheque (null,
		  "https://www.aixenprovence.fr/local/cache-gd2/6c/8c05c7a1a31a1b437203525f7abe00.jpg?1529675942",
		  "Bibliothèque Méjanes - Deux Ormes",
		  "Dans une bastide provençale entourée d’un jardin au cœur du quartier du Jas de Bouffan, des collections tous supports pour enfants et adultes, mais aussi des espaces de détente."
		  , "Allée des Amandiers - Jas de Bouffan\n" + "13090 Aix-en-Provence",
		  "06 48 87 17 47 ", "Mardi, vendredi : 14h-18h, Mercredi, samedi : 10h-13h / 14h-18h"
		  ,"citedulivre@mairie-aixenprovence.fr","http://www.citedulivre-aix.com", 78, null));
		  
		  br.save(new Bibliotheque (null,
		  "https://www.aixenprovence.fr/local/cache-gd2/33/21a2a3b60df655579ea72ce338cc93.jpg?1529677445",
		  "Le Médiabus les Méjanes",
		  "Deux bus électriques aménagés pour recevoir collections et public ! Des animations sont régulièrement proposées Côté Méjanes , et des bibliothécaires sont présents pour vous conseiller."
		  , "11 points de desserte sont assurés du mardi au samedi", "06 48 87 17 47",
		  "Puyricard: Place W. Rousseau. Beisson: Rue René Coty"
		  ,"citedulivre@mairie-aixenprovence.fr","http://www.citedulivre-aix.com", 300,null));
		  
		 
	// Création de mes livres 
//Livre l1 = new Livre (null, null, "1984", "G.Orwell", "ayayayayayay", 978451236, biblio);
//lr.save(l1);
		  
		  // Creation de 10 livres pour chaque la bibliotheque
		  Random rnd=new Random ();
		  br.findAll().forEach(b ->{
			  for (int i=0; i <10; i++) {
				  Livre l = new Livre();
				  l.setNomLivre(RandomString.make(18));
				  l.setDescription(RandomString.make(20));
				  l.setNomAuteur(RandomString.make(18));
				  l.setCodeIsbn(rnd.nextInt(4000000,8000000));
				  l.setBiblio(b);
				  
				  lr.save(l);
			  }
		  });
		  
//		  br.findAll().forEach(b ->{
//		  lr.save(new Livre (null, "tu","rh","er","er",4785,null));
//		  lr.save(new Livre (null, "tu","rh","er","er",4785,null));
//		  lr.save(new Livre (null, "tu","rh","er","er",4785,null));
//		  lr.save(new Livre (null, "tu","rh","er","er",4785,null));
//		  });
//		
			  
//				 public Livre(Long id, String image, String nomLivre, String nomAuteur, String description, int codeISBN,
//							Bibliotheque biblio)
//		  private Long id;
//			private String image;
//			private String nomLivre;
//			private String nomAuteur;
//			@Column(length=512) // preciser le numero de caracteres en cas de texte assez long 
//			private String  description;
//			private int codeISBN;
		
		//METHODE RANDOM AVEC LA BOUCLE FOR 
		
//		Random rnd=new Random ();
//		
//		
//		
//			for (int i=0; i <50; i++) {
//				Bibliotheque biblio=new Bibliotheque();
//			String prefix="06";
//				biblio.setNom(RandomString.make(10));
//				biblio.setDescription(RandomString.make(10));
//				String nextInt = prefix + " "+ rnd.nextInt (4000000, 8000000);
//				//biblio.setTelephone(prefix + nextInt);
//				//biblio.setTelephone(prefix + rnd.nextInt (4000000, 8000000));
//				//biblio.setTelephone(06 + rnd.nextInt (4000000, 8000000));
//				//biblio.setTelephone(nextInt);
//				//int nextInt = rnd.nextInt (prefix+4000000, prefix+8000000);
//				//int nextInt = rnd.nextInt (4000000,8000000);
//				//biblio.setTelephone(nextInt);
//				biblio.setTelephone(nextInt);
//				br.save(biblio);
//			}
	



//br.findAll().forEach(b -> {
//	System.out.println(b.getImage());
//	System.out.println(b.getNom());
//	System.out.println(b.getDescription());
//	System.out.println(b.getAdresse());
//	System.out.println(b.getTelephone());
//	System.out.println(b.getHoraire());
//	System.out.println(b.getContact());
//	System.out.println(b.getSiteWeb());
//	
//	
//});
		}
	}
		
	
	

