/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Classe {
    
    private int id;
    private int niveau;
    private String nom;
    private String anneeScolaire;

    public Classe(int id, int niveau, String nom, String anneeScolaire) {
        this.id = id;
        this.niveau = niveau;
        this.nom = nom;
        this.anneeScolaire = anneeScolaire;
    }

    public Classe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    @Override
    public String toString() {
        return "Classe{" + "id=" + id + ", niveau=" + niveau + ", nom=" + nom + ", anneeScolaire=" + anneeScolaire + '}';
    }
    
    
}
