/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


 


public class Collection {
    private String nom;
    private List<Disque> dd ;
 
    public Collection(String nom) {
        this.nom = nom;
        this.dd = new ArrayList<Disque>();
       
    }
    
     public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Disque> getDd() {
        return dd;
    }

    public void setDd(List<Disque> dd) {
        this.dd = dd;
    }
    
    public void ajouter(Disque d){
        dd.add(d );
    }
    
    public void retirer(int id){
        dd.remove(id);
    }
    
    public Disque getDisque(int id){
        return dd.get(id);
    }
    
    public Disque getDisque(String nom){
       
       Iterator<Disque> iter=dd.iterator();
       while(iter.hasNext()){
           Disque d=iter.next();
           if(d.getNom().equals(nom))
               return d;
       }
       return null ;  
    }
    
    public int getNbDisque(){
        return dd.size();
    }
    
  
    public double getPrix(){
        double prix =0;
         Iterator<Disque> iter=dd.iterator();
       while(iter.hasNext()){
           prix+=iter.next().getPrix();
           
        }
       return prix ;  
      }
     public double getPrix(int id){
      
       return dd.get(id).getPrix();  
      }
    
    
    }
    
    
    
    






