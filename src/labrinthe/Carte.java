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
public class Carte {
    int tresor;// correspond au tresor associé à la carte
    boolean visible  = false; // la carte est face caché au debut, quand un joueur trouve son trésor sa carte se retourne 
    
    public void retournerCarte (){
        boolean visible = true;
    }
    
}
