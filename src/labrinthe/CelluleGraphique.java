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
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee = uneCellule;
    }
    
    ImageIcon  angle0vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle0vide.jpg"));
    ImageIcon  angle0rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle0rouge.jpg"));
    ImageIcon  angle0bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle0bleu.jpg"));
    ImageIcon  angle0jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle0jaune.jpg"));
    ImageIcon  angle0vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle0vert.jpg"));
    ImageIcon  angle0biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle0biere.jpg"));
    ImageIcon  angle0pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle0pet.jpg"));
    ImageIcon  angle0cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle0cookie.jpg"));
    ImageIcon  angle0verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle0verre.jpg"));
    ImageIcon  angle1vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle1vide.jpg"));
    ImageIcon  angle1rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle1rouge.jpg"));
    ImageIcon  angle1bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle1bleu.jpg"));
    ImageIcon  angle1jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle1jaune.jpg"));
    ImageIcon  angle1vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle1vert.jpg"));
    ImageIcon  angle1biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle1biere.jpg"));
    ImageIcon  angle1pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle1pet.jpg"));
    ImageIcon  angle1cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle1cookie.jpg"));
    ImageIcon  angle1verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle1verre.jpg"));
    ImageIcon  angle2vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle2vide.jpg"));
    ImageIcon  angle2rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle2rouge.jpg"));
    ImageIcon  angle2bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle2bleu.jpg"));
    ImageIcon  angle2jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle2jaune.jpg"));
    ImageIcon  angle2vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle2vert.jpg"));
    ImageIcon  angle2biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle2biere.jpg"));
    ImageIcon  angle2pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle2pet.jpg"));
    ImageIcon  angle2cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle2cookie.jpg"));
    ImageIcon  angle2verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle2verre.jpg"));
    ImageIcon  angle3vide = new javax.swing.ImageIcon(getClass().getResource("/images/angle3vide.jpg"));
    ImageIcon  angle3rouge = new javax.swing.ImageIcon(getClass().getResource("/images/angle3rouge.jpg"));
    ImageIcon  angle3bleu = new javax.swing.ImageIcon(getClass().getResource("/images/angle3bleu.jpg"));
    ImageIcon  angle3jaune = new javax.swing.ImageIcon(getClass().getResource("/images/angle3jaune.jpg"));
    ImageIcon  angle3vert = new javax.swing.ImageIcon(getClass().getResource("/images/angle3vert.jpg"));
    ImageIcon  angle3biere = new javax.swing.ImageIcon(getClass().getResource("/images/angle3biere.jpg"));
    ImageIcon  angle3pet = new javax.swing.ImageIcon(getClass().getResource("/images/angle3pet.jpg"));
    ImageIcon  angle3cookie = new javax.swing.ImageIcon(getClass().getResource("/images/angle3cookie.jpg"));
    ImageIcon  angle3verre = new javax.swing.ImageIcon(getClass().getResource("/images/angle3verre.jpg"));
    ImageIcon  t0vide = new javax.swing.ImageIcon(getClass().getResource("/images/t0vide.jpg"));
    ImageIcon  t0rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t0rouge.jpg"));
    ImageIcon  t0bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t0bleu.jpg"));
    ImageIcon  t0jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t0jaune.jpg"));
    ImageIcon  t0vert = new javax.swing.ImageIcon(getClass().getResource("/images/t0vert.jpg"));
    ImageIcon  t0biere = new javax.swing.ImageIcon(getClass().getResource("/images/t0biere.jpg"));
    ImageIcon  t0pet = new javax.swing.ImageIcon(getClass().getResource("/images/t0pet.jpg"));
    ImageIcon  t0cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t0cookie.jpg"));
    ImageIcon  t0verre = new javax.swing.ImageIcon(getClass().getResource("/images/t0verre.jpg"));
    ImageIcon  t1vide = new javax.swing.ImageIcon(getClass().getResource("/images/t1vide.jpg"));
    ImageIcon  t1rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t1rouge.jpg"));
    ImageIcon  t1bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t1bleu.jpg"));
    ImageIcon  t1jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t1jaune.jpg"));
    ImageIcon  t1vert = new javax.swing.ImageIcon(getClass().getResource("/images/t1vert.jpg"));
    ImageIcon  t1biere = new javax.swing.ImageIcon(getClass().getResource("/images/t1biere.jpg"));
    ImageIcon  t1pet = new javax.swing.ImageIcon(getClass().getResource("/images/t1pet.jpg"));
    ImageIcon  t1cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t1cookie.jpg"));
    ImageIcon  t1verre = new javax.swing.ImageIcon(getClass().getResource("/images/t1verre.jpg"));
    ImageIcon  t2vide = new javax.swing.ImageIcon(getClass().getResource("/images/t2vide.jpg"));
    ImageIcon  t2rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t2rouge.jpg"));
    ImageIcon  t2bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t2bleu.jpg"));
    ImageIcon  t2jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t2jaune.jpg"));
    ImageIcon  t2vert = new javax.swing.ImageIcon(getClass().getResource("/images/t2vert.jpg"));
    ImageIcon  tbiere = new javax.swing.ImageIcon(getClass().getResource("/images/tbiere.jpg"));
    ImageIcon  t20pet = new javax.swing.ImageIcon(getClass().getResource("/images/t20pet.jpg"));
    ImageIcon  t2cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t2cookie.jpg"));
    ImageIcon  t2verre = new javax.swing.ImageIcon(getClass().getResource("/images/t2verre.jpg"));
    ImageIcon  t3vide = new javax.swing.ImageIcon(getClass().getResource("/images/t3vide.jpg"));
    ImageIcon  t3rouge = new javax.swing.ImageIcon(getClass().getResource("/images/t3rouge.jpg"));
    ImageIcon  t3bleu = new javax.swing.ImageIcon(getClass().getResource("/images/t3bleu.jpg"));
    ImageIcon  t3jaune = new javax.swing.ImageIcon(getClass().getResource("/images/t3jaune.jpg"));
    ImageIcon  t3vert = new javax.swing.ImageIcon(getClass().getResource("/images/t3vert.jpg"));
    ImageIcon  t3biere = new javax.swing.ImageIcon(getClass().getResource("/images/t3biere.jpg"));
    ImageIcon  t3pet = new javax.swing.ImageIcon(getClass().getResource("/images/t3pet.jpg"));
    ImageIcon  t3cookie = new javax.swing.ImageIcon(getClass().getResource("/images/t3cookie.jpg"));
    ImageIcon  t3verre = new javax.swing.ImageIcon(getClass().getResource("/images/t3verre.jpg"));
    ImageIcon  ligne0vide = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0vide.jpg"));
    ImageIcon  ligne0rouge = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0rouge.jpg"));
    ImageIcon  ligne0bleu = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0bleu.jpg"));
    ImageIcon  ligne0jaune = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0jaune.jpg"));
    ImageIcon  ligne0vert = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0vert.jpg"));
    ImageIcon  ligne0biere = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0biere.jpg"));
    ImageIcon  ligne0pet = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0pet.jpg"));
    ImageIcon  ligne0cookie = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0cookie.jpg"));
    ImageIcon  ligne0verre = new javax.swing.ImageIcon(getClass().getResource("/images/ligne0verre.jpg"));
    ImageIcon  ligne1vide = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1vide.jpg"));
    ImageIcon  ligne1rouge = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1rouge.jpg"));
    ImageIcon  ligne1bleu = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1bleu.jpg"));
    ImageIcon  ligne1jaune = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1jaune.jpg"));
    ImageIcon  ligne1vert = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1vert.jpg"));
    ImageIcon  ligne1biere = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1biere.jpg"));
    ImageIcon  ligne1pet = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1pet.jpg"));
    ImageIcon  ligne1cookie = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1cookie.jpg"));
    ImageIcon  ligne1verre = new javax.swing.ImageIcon(getClass().getResource("/images/ligne1verre.jpg"));
    ImageIcon  croixvide = new javax.swing.ImageIcon(getClass().getResource("/images/croixvide.jpg"));
    ImageIcon  croixrouge = new javax.swing.ImageIcon(getClass().getResource("/images/croixrouge.jpg"));
    ImageIcon  croixbleu = new javax.swing.ImageIcon(getClass().getResource("/images/croixbleu.jpg"));
    ImageIcon  croixjaune = new javax.swing.ImageIcon(getClass().getResource("/images/croixjaune.jpg"));
    ImageIcon  croixvert = new javax.swing.ImageIcon(getClass().getResource("/images/croixvert.jpg"));
    ImageIcon  croixbiere = new javax.swing.ImageIcon(getClass().getResource("/images/croixbiere.jpg"));
    ImageIcon  croixpet = new javax.swing.ImageIcon(getClass().getResource("/images/croixpet.jpg"));
    ImageIcon  croixcookie = new javax.swing.ImageIcon(getClass().getResource("/images/croixcookie.jpg"));
    ImageIcon  croixverre = new javax.swing.ImageIcon(getClass().getResource("/images/croixverre.jpg"));
    
    
    
    @Override // cellule de base au début de la partie 
    public void paintComponent(Graphics G) {
        if(celluleAssociee.pionCourant == null && celluleAssociee.pionCourant == null){ // Cellule vide, pas de joueur, pas d'objet
            switch (celluleAssociee.type){
                case 0 : // angle
                    switch(celluleAssociee.sens){ // les 4 sens 
                        case 0:
                            setIcon(angle0vide);
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
                            setIcon(angle0vide);
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
                            setIcon(ligne0vide);
                            break;
                        case 1:
                            //
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
                            setIcon(angle0rouge);
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
                            setIcon(angle0bleu);
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
                            setIcon(angle0vert);
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
                            setIcon(angle0jaune);
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
