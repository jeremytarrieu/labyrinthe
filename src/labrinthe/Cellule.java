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
    boolean [] lien = new boolean [4]; /* tableau informant si la case possède un lien avec les cases alentoures
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
    
}
