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
public class Tresor {
    int type; // chaque tresor possède un numéro 
    boolean trouve; // renseigne si le tresor est trouve ou non

    public Tresor(int unType){
        trouve = false;
        type = unType;
    }
    public boolean etreTrouve(){
        if (trouve == true){
            return true;
        }return false;
    }
    
}
