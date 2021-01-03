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
public class Joueur {
    String nom = new String();
    String couleur = new String();
    Carte deck [] = new Carte[3]; // Yu-Gi-Ho... à toi de jouer !
    
    
    public void affecterCouleur(String uneCouleur){
        couleur = uneCouleur;
    }
    
    public boolean etreGagnant(){
        /*
        Prends un Joueur en argument et renvoie un booleen.
        Si le joueur possède toutes ses cartes retournées il gagne
        */
        
        for (int i = 0;i<3;i++){
            if(this.deck[i].visible == false){
                return false;
            }       
        }return true;
    }
}
