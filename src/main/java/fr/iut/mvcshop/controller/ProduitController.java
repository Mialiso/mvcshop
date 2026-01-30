package fr.iut.mvcshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import fr.iut.mvcshop.model.Produit;
import fr.iut.mvcshop.repository.ProduitRepository;

@Controller
public class ProduitController {

    private ProduitRepository repo; 

    public ProduitController(ProduitRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/produits")
    public String listeProduits(Model model){
        List<Produit> listeProduit = this.repo.findAll(); 
        model.addAttribute("produits", listeProduit); 
        return"produits"; 
    }
}
