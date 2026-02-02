package fr.iut.mvcshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.iut.mvcshop.model.Produit;
import fr.iut.mvcshop.repository.ProduitRepository;

@SpringBootApplication
public class MvcShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcShopApplication.class, args);
	}
	@Bean
	CommandLineRunner initBDD(ProduitRepository repo){
		return args->{
			// repo.save(new Produit("AngeRajoelina", 1, 10)); 
			// repo.save(new Produit("Ramanonaka", 50, 120)); 
			// repo.save(new Produit("Lovia", 10, 120)); 
			// repo.save(new Produit("Basy", 120, 120)); 
			// repo.save(new Produit("Ramy", 2, 120)); 
			// repo.save(new Produit("Vary", 2, 120)); 
			repo.findAll().forEach(System.out::println);
		};
	}
}
