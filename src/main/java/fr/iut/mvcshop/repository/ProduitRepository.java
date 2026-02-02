package fr.iut.mvcshop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.iut.mvcshop.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    @Query("SELECT  p FROM Produit p WHERE p.nom LIKE :x")
    Page<Produit> rechercher(@Param(value = "x") String mc, Pageable pageable); 
    
    
    // Page<Produit> findByNomContaining(String nom, Pageable pageable); 
}
