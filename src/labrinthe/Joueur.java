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
    String couleur = new String(); // rouge, jaune, vert, bleu
    int tresor1;
    int tresor2;// les 2 trésors associés au joueur
    
    public Joueur(){}
    
    public void affecterCouleur(String uneCouleur){
        couleur = uneCouleur;
    }
    
    
}
