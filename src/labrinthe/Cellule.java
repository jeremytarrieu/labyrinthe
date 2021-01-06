/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrinthe;

/**
 *
 * @author tarri
 */
public class Cellule {
    
    int tresor = 0; // correspond à l'un des 24 trésors, chaque trésor possède 1 numéro. (nombre à revoir) 0 = pas de tresor
    Joueur pionCourant ;
    boolean deplacement = false;//true = c'est une case de déplacement possible (voir methode rechercheDeplcement Possibles ds Grille)
    boolean [] lien = new boolean[4]; /* tableau informant si la case possède un lien avec les cases alentoures
    lien[0] = lien avec la case en dessous
    lien[1] = lien avec la case de gauche
    lien[2] = lien avec la case de droite
    lien[3] = lien avec la case au dessus
    true veut dire qu'on peut y accéder, false non
    */
    
    public void affecterJoueur(Joueur unJoueur){
        // affecte le Joueur à cette case
        pionCourant = unJoueur;
    }
    
    public boolean celluleOccupee (){
        // renvoie true s'il y a un Joueur sur cette cellule
        if (pionCourant == null){
            return false;
        }return true;
    }
    
    public Joueur repcupererPion(){
        // renvoie le Joueur present sur la cellule, le supprime de la cellule
        Joueur pionRetour = pionCourant;
        pionCourant = null;
        return pionRetour;
    }
    
    public boolean presenceJoueur(Joueur unJoueur){
        if (pionCourant == unJoueur){
            return true;
        }return false;
    }
    
    public int lireTresor(){
        return tresor;
    }
    
    public void angle(int sens){
        //definit la case comme étant chemin en angle
        // le sens 0,1,2 ou 3 correspond au sens de l'angle, 
        // 0 pour celui en bas à gauche, 1 haut gauche, 2 haut droite, 3 bas droite
        
        switch (sens){
            case 0:
                lien[0] = false;
                lien[1] = false;
                lien[2] = true;
                lien[3] = true;
                break;
            case 1:
                lien[0] = true;
                lien[1] = false;
                lien[2] = true;
                lien[3] = false;
            case 2:
                lien[0] = true;
                lien[1] = true;
                lien[2] = false;
                lien[3] = false;
            case 3 : 
                lien[0] = false;
                lien[1] = true;
                lien[2] = false;
                lien[3] = true;
        }
    }
    
    public void t(int sens){
        //définit la case comme un chemin en 'T'
        // 0 pointe vers le haut, 1 droite, 2 gauche, 3 bas
        switch (sens){
            case 0:
                lien[0] = false;
                lien[1] = true;
                lien[2] = true;
                lien[3] = true;
                break;
            case 1:
                lien[0] = true;
                lien[1] = false;
                lien[2] = true;
                lien[3] = true;
            case 2:
                lien[0] = true;
                lien[1] = true;
                lien[2] = false;
                lien[3] = true;
            case 3 : 
                lien[0] = true;
                lien[1] = true;
                lien[2] = true;
                lien[3] = false;
        }
    }
    
    public void ligne(int sens){
        //définit la case comme un chemin droite
        // 1 vertical
        // 2 horizontal
        switch (sens){
            case 0:
                lien[0] = true;
                lien[1] = false;
                lien[2] = false;
                lien[3] = true;
                break;
            case 1:
                lien[0] = false;
                lien[1] = true;
                lien[2] = true;
                lien[3] = false;
        }
    }
    
    public void croix(){
        // definit la case comme un chemin en croix 
        lien[0] = true;
        lien[1] = true;
        lien[2] = true;
        lien[3] = true;
    }
}
