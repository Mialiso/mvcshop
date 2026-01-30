package fr.iut.mvcshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.iut.mvcshop.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    
}
