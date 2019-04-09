/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ex3;

import java.util.*;

/**
 *
 * @author pc01
 */
public class Disque {
    private String nom;
    private double prixOeuvre;
    private double prixMinute;
    private ArrayList<oeuvre> o;

    public Disque(String nom, double prixOeuvre, double prixMinute) {
        this.nom = nom;
        this.prixOeuvre = prixOeuvre;
        this.prixMinute = prixMinute;
        this.o = new ArrayList<>();
    }
 
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixOeuvre() {
        return prixOeuvre;
    }

    public void setPrixOeuvre(double prixOeuvre) {
        this.prixOeuvre = prixOeuvre;
    }

    public double getPrixMinute() {
        return prixMinute;
    }

    public void setPrixMinute(double prixMinute) {
        this.prixMinute = prixMinute;
    }

    public ArrayList<oeuvre> getO() {
        return o;
    }

    public void setO(ArrayList<oeuvre> o) {
        this.o = o;
    }
    
    public void creeOeuvre(String nom,int duree){
        
        o.add(new oeuvre(nom, duree));
        
    }
    
    public void detruireOeuvre(oeuvre O){
        Iterator<oeuvre> iter=o.iterator();
        while(iter.hasNext()){
            if(iter.next().equals(O))
                iter.remove();
            
        }
    }
    
    public void detruireOeuvre(int n){
       o.remove(n);
           
        }
    
    public oeuvre getOeuvre(int n){
       return o.get(n);
        }
    
    public int getNbOeuvres(){
        return o.size();
    }
    
    public int getDuree(){
        int duree=0;
       Iterator<oeuvre> iter=o.iterator();
       while(iter.hasNext()){
           duree+=iter.next().getDuree();
           
       }
       return duree ;  
    }
    
    
    public double getPrix(){
        return getDuree()*getNbOeuvres()+prixOeuvre;
    }
    

    
    
    
}
