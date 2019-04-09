/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ex3;

import java.util.Objects;

/**
 *
 * @author pc01
 */
public class oeuvre {
    private String nom;
    private int duree;

    public oeuvre(String nom, int duree) {
        this.nom = nom;
        this.duree = duree;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final oeuvre other = (oeuvre) obj;
        if (this.duree != other.duree) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "oeuvre{" + "nom=" + nom + ", duree=" + duree + '}';
        
    }
    
}
