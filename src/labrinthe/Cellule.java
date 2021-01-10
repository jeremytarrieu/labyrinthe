/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrinthe;

public class Cellule {
    int type; //type de cellule, 0 'angle', 1 't', 2 'ligne', '3' croix;
    int sens; //sens de la cellule, 
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
    
    public Cellule(){
        type = -1;
    }
    
    public Cellule(int unType, int sens){
        switch (unType){
            case 0:
                type = 0;
                angle(sens);
                break;
            case 1:
                type = 1;
                t(sens);
                break;
            case 2:
                type = 2;
                ligne(sens);
                break;
            case 3:
                type = 3;
                croix();
                break;
                
                
        }
    }
    
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
        
        type = 0;
        
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
    
    public void t(int unSens){
        //définit la case comme un chemin en 'T'
        // 0 pointe vers le haut, 1 droite, 2 gauche, 3 bas
        
        type = 1;
        switch (unSens){
            case 0:
                lien[0] = false;
                lien[1] = true;
                lien[2] = true;
                lien[3] = true;
                sens = 0;
                break;
            case 1:
                lien[0] = true;
                lien[1] = false;
                lien[2] = true;
                lien[3] = true;
                sens = 1;
            case 2:
                lien[0] = true;
                lien[1] = true;
                lien[2] = false;
                lien[3] = true;
                sens = 2;
            case 3 : 
                lien[0] = true;
                lien[1] = true;
                lien[2] = true;
                lien[3] = false;
                sens = 3;
        }
    }
    
    public void ligne(int sens){
        //définit la case comme un chemin droite
        // 1 vertical
        // 2 horizontal
        type = 2;
        switch (sens){
            case 0:
                lien[0] = true;
                lien[1] = false;
                lien[2] = false;
                lien[3] = true;
                sens = 0;
                break;
            case 1:
                lien[0] = false;
                lien[1] = true;
                lien[2] = true;
                lien[3] = false;
                sens = 1;
                break;
        }
    }
    
    public void croix(){
        // definit la case comme un chemin en croix 
        lien[0] = true;
        lien[1] = true;
        lien[2] = true;
        lien[3] = true;
        sens = 0;
        type = 3;
    }
}
