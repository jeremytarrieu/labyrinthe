/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrinthe;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author tarri
 */
public class CelluleGraphique extends JButton{
    
    Cellule celluleAssociee;
    
    ImageIcon  angle0vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle0vide.png"));
//    ImageIcon  angle0rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle0rouge.png"));
//    ImageIcon  angle0bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle0bleu.png"));
//    ImageIcon  angle0jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle0jaune.png"));
//    ImageIcon  angle0vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle0vert.png"));
//    ImageIcon  angle0biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle0biere.png"));
//    ImageIcon  angle0pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle0pet.png"));
//    ImageIcon  angle0cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle0cookie.png"));
//    ImageIcon  angle0verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle0verre.png"));
    ImageIcon  angle1vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle1vide.png"));
//    ImageIcon  angle1rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle1rouge.png"));
//    ImageIcon  angle1bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle1bleu.png"));
//    ImageIcon  angle1jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle1jaune.png"));
//    ImageIcon  angle1vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle1vert.png"));
//    ImageIcon  angle1biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle1biere.png"));
//    ImageIcon  angle1pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle1pet.png"));
//    ImageIcon  angle1cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle1cookie.png"));
//    ImageIcon  angle1verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle1verre.png"));
    ImageIcon  angle2vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle2vide.png"));
//    ImageIcon  angle2rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle2rouge.png"));
//    ImageIcon  angle2bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle2bleu.png"));
//    ImageIcon  angle2jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle2jaune.png"));
//    ImageIcon  angle2vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle2vert.png"));
//    ImageIcon  angle2biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle2biere.png"));
//    ImageIcon  angle2pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle2pet.png"));
//    ImageIcon  angle2cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle2cookie.png"));
//    ImageIcon  angle2verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle2verre.png"));
    ImageIcon  angle3vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle3vide.png"));
//    ImageIcon  angle3rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle3rouge.png"));
//    ImageIcon  angle3bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle3bleu.png"));
//    ImageIcon  angle3jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle3jaune.png"));
//    ImageIcon  angle3vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle3vert.png"));
//    ImageIcon  angle3biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle3biere.png"));
//    ImageIcon  angle3pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle3pet.png"));
//    ImageIcon  angle3cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle3cookie.png"));
//    ImageIcon  angle3verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle3verre.png"));
    ImageIcon  t0vide = new javax.swing.ImageIcon(getClass().getResource("/images/t0vide.png"));
//    ImageIcon  t0rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t0rouge.png"));
//    ImageIcon  t0bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t0bleu.png"));
//    ImageIcon  t0jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t0jaune.png"));
//    ImageIcon  t0vert = new javax.swing.ImageIcon(getClass().getResource("/images/t0vert.png"));
//    ImageIcon  t0biere = new javax.swing.ImageIcon(getClass().getResource("/images/t0biere.png"));
//    ImageIcon  t0pet = new javax.swing.ImageIcon(getClass().getResource("/images/t0pet.png"));
//    ImageIcon  t0cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t0cookie.png"));
//    ImageIcon  t0verre = new javax.swing.ImageIcon(getClass().getResource("/images/t0verre.png"));
    ImageIcon  t1vide = new javax.swing.ImageIcon(getClass().getResource("/images/t1vide.png"));
//    ImageIcon  t1rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t1rouge.png"));
//    ImageIcon  t1bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t1bleu.png"));
//    ImageIcon  t1jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t1jaune.png"));
//    ImageIcon  t1vert = new javax.swing.ImageIcon(getClass().getResource("/images/t1vert.png"));
//    ImageIcon  t1biere = new javax.swing.ImageIcon(getClass().getResource("/images/t1biere.png"));
//    ImageIcon  t1pet = new javax.swing.ImageIcon(getClass().getResource("/images/t1pet.png"));
//    ImageIcon  t1cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t1cookie.png"));
//    ImageIcon  t1verre = new javax.swing.ImageIcon(getClass().getResource("/images/t1verre.png"));
    ImageIcon  t2vide = new javax.swing.ImageIcon(getClass().getResource("/images/t2vide.png"));
//    ImageIcon  t2rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t2rouge.png"));
//    ImageIcon  t2bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t2bleu.png"));
//    ImageIcon  t2jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t2jaune.png"));
//    ImageIcon  t2vert = new javax.swing.ImageIcon(getClass().getResource("/images/t2vert.png"));
//    ImageIcon  tbiere = new javax.swing.ImageIcon(getClass().getResource("/images/tbiere.png"));
//    ImageIcon  t20pet = new javax.swing.ImageIcon(getClass().getResource("/images/t20pet.png"));
//    ImageIcon  t2cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t2cookie.png"));
//    ImageIcon  t2verre = new javax.swing.ImageIcon(getClass().getResource("/images/t2verre.png"));
    ImageIcon  t3vide = new javax.swing.ImageIcon(getClass().getResource("/images/t3vide.png"));
//    ImageIcon  t3rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t3rouge.png"));
//    ImageIcon  t3bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t3bleu.png"));
//    ImageIcon  t3jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t3jaune.png"));
//    ImageIcon  t3vert = new javax.swing.ImageIcon(getClass().getResource("/images/t3vert.png"));
//    ImageIcon  t3biere = new javax.swing.ImageIcon(getClass().getResource("/images/t3biere.png"));
//    ImageIcon  t3pet = new javax.swing.ImageIcon(getClass().getResource("/images/t3pet.png"));
//    ImageIcon  t3cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t3cookie.png"));
//    ImageIcon  t3verre = new javax.swing.ImageIcon(getClass().getResource("/images/t3verre.png"));
    ImageIcon  ligne0vide = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0vide.png"));
//    ImageIcon  ligne0rouge = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0rouge.png"));
//    ImageIcon  ligne0bleu = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0bleu.png"));
//    ImageIcon  ligne0jaune = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0jaune.png"));
//    ImageIcon  ligne0vert = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0vert.png"));
//    ImageIcon  ligne0biere = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0biere.png"));
//    ImageIcon  ligne0pet = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0pet.png"));
//    ImageIcon  ligne0cookie = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0cookie.png"));
//    ImageIcon  ligne0verre = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0verre.png"));
    ImageIcon  ligne1vide = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1vide.png"));
//    ImageIcon  ligne1rouge = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1rouge.png"));
//    ImageIcon  ligne1bleu = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1bleu.png"));
//    ImageIcon  ligne1jaune = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1jaune.png"));
//    ImageIcon  ligne1vert = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1vert.png"));
//    ImageIcon  ligne1biere = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1biere.png"));
//    ImageIcon  ligne1pet = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1pet.png"));
//    ImageIcon  ligne1cookie = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1cookie.png"));
//    ImageIcon  ligne1verre = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1verre.png"));
    ImageIcon  croixvide = new javax.swing.ImageIcon(getClass().getResource("/images/croixvide.png"));
//    ImageIcon  croixrouge = new javax.swing.ImageIcon(getClass().getResource("/images/croixrouge.png"));
//    ImageIcon  croixbleu = new javax.swing.ImageIcon(getClass().getResource("/images/croixbleu.png"));
//    ImageIcon  croixjaune = new javax.swing.ImageIcon(getClass().getResource("/images/croixjaune.png"));
//    ImageIcon  croixvert = new javax.swing.ImageIcon(getClass().getResource("/images/croixvert.png"));
//    ImageIcon  croixbiere = new javax.swing.ImageIcon(getClass().getResource("/images/croixbiere.png"));
//    ImageIcon  croixpet = new javax.swing.ImageIcon(getClass().getResource("/images/croixpet.png"));
//    ImageIcon  croixcookie = new javax.swing.ImageIcon(getClass().getResource("/images/croixcookie.png"));
//    ImageIcon  croixverre = new javax.swing.ImageIcon(getClass().getResource("/images/croixverre.png"));
    
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee = uneCellule;
    }
    
    
    
    
    @Override // cellule de base au début de la partie 
    public void paintComponent(Graphics G) {
        System.out.print(celluleAssociee.type);
        super.paintComponent(G);
        if(celluleAssociee.pionCourant == null && celluleAssociee.pionCourant == null){ // Cellule vide, pas de joueur, pas d'objet
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            setIcon(angle0vide);
                            break;
                        case 1:
                            setIcon(angle1vide);
                            break;
                        case 2:
                            setIcon(angle2vide);
                            break;
                        case 3:
                            setIcon(angle3vide);
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            setIcon(t0vide);
                            break;
                        case 1:
                            setIcon(t1vide);
                            break;
                        case 2:
                            setIcon(t2vide);
                            break;
                        case 3:
                            setIcon(t3vide);
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            setIcon(ligne0vide);
                            break;
                        case 1:
                            setIcon(ligne1vide);
                            break;
                    }
                case 3:// croix
                    setIcon(croixvide);
                    break;
            }
        }else if (celluleAssociee.tresor == 0){// biere
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
        }
    }else if (celluleAssociee.tresor == 1){// cookie
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
            }
        }else if (celluleAssociee.tresor == 2){// pet
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
        }
    }else if (celluleAssociee.tresor == 3){// verre
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
        }
    }else if (celluleAssociee.pionCourant.couleur == "rouge"){// pion rouge
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
        }
    }else if (celluleAssociee.pionCourant.couleur == "bleu"){// pion bleu
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
        }
    }else if (celluleAssociee.pionCourant.couleur == "vert"){// pion vert
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //                            
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
        }
    }else if (celluleAssociee.pionCourant.couleur == "jaune"){// pion jaune
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 1: // 't'
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                        case 2:
                            //
                            break;
                        case 3:
                            //
                            break; 
                    }
                case 2 : // ligne
                    switch(celluleAssociee.sens){
                        case 0:
                            //
                            break;
                        case 1:
                            //
                            break;
                    }
                case 3:// croix
                    //
                    break;
        }
    }
    }
    
}
