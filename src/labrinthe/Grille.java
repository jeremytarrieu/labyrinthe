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
public class Grille {

    Cellule celluleExt; // la case qui n'est pas dans le cadre que l'on pousse

    Cellule cellule[][] = new Cellule[7][7];
    // plateau de jeu

    public Grille() { // constructaur, créée les cellules de la grille
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                cellule[i][j] = new Cellule();
            }
        }
    }

    public void rechercheCelluleDeplacement(Cellule uneCellule) {
        /* 
        Prends une cellule en entrée et retrouve ses coordonées afin de
            passer la variable deplacement des cellules 
            alentoures à true si le déplacement entre elles est possible 
        Si une cellule presente un lien on teste aussi pour cette 
            cellule jusqu'a ce qu'on ai fait toutes les cellules qui 
            composent notre chemin
         */
        int x = 0; // initialisation des variables afin de ne pas avoir d'erreur
        int y = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (cellule[i][j] == uneCellule) {
                    x = i;
                    y = j;
                }
            }
        }//on retouve les coordonnees de la cellule

        /*on fait le tour des cases alentoures (haut, gauche, droite, et haut)
        On vérifie que la case est dans le tableau, 
        que les deux cellules on un lien là où elles se touchent
         */
        // lien avec la case du bas
        if (x != 0 // on vérifie que l'on ne sort pas de la grille
                && cellule[x][y].lien[0] == true // on vérifie qu'il y a bien un lien de part et d'autre de la casse
                && cellule[x - 1][y].lien[4] == true) {
            cellule[x - 1][y].deplacement = true;
            rechercheCelluleDeplacement(cellule[x - 1][y]);
        }

        // gauche
        if (y != 0
                && cellule[x][y].lien[1] == true
                && cellule[x][y - 1].lien[2] == true) {
            cellule[x][y - 1].deplacement = true;
            rechercheCelluleDeplacement(cellule[x][y - 1]);
        }

        //droite
        if (y != 7 // on vérifie que l'on ne sort pas de la grille
                && cellule[x][y].lien[2] == true // on vérifie qu'il y a bien un lien de part et d'autre de la casse
                && cellule[x][y + 1].lien[1] == true) {
            cellule[x][y - 1].deplacement = true;
            rechercheCelluleDeplacement(cellule[x][y + 1]);
        }

        //haut
        if (x != 7 // on vérifie que l'on ne sort pas de la grille
                && cellule[x][y].lien[0] == true // on vérifie qu'il y a bien un lien de part et d'autre de la casse
                && cellule[x + 1][y].lien[4] == true) {
            cellule[x + 1][y].deplacement = true;
            rechercheCelluleDeplacement(cellule[x + 1][y]);
        }
    }
    
    public void reinitialisationDeplacement(){
        // remet toutes les variables deplacement des cellules à false
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                cellule[i][j].deplacement = false;
            }
        }
        
    }

    public void glissement(int position) {
        /* décale toute une colonne ou ligne
        comme on le fait dans le jeu avec une pièce supplémentaire
        La position correspond à la position à partir de 
        laquelle on déplace en inserant la celluleExt
        Il y a 12 position possibles :
        1,2,3 sont celles en dessous des cellules de coordonnées :
        (0,1) (0,3) (0,5)
        4,5,6 ...................
        (1,0) (3,0) (5,0)
        7,8,9 ...................
        (1,7) (3,7) (5,7)
        10,11,12 ................
        (7,1) (7,3) (7,5)
        (en prenant un cadrillage avec 0,0 en bas à gauche 
        et 7,7 en haut à droite
        lorsqu'on déplace la cellule on garde en mémoire
        la cellule de l'autre bout de la rangée,
        on la supprime de la grille puis on décale toute la rangée, 
        on insère la celluleExt dans la case position (en argument)
        et on affecte à celluleExt la cellule en mémoire
        On affecte le joueur de la cellule Stockage à l'ancienne celluleExt qui
        vient d'être réintroduite (comme le veulent les règles
         */
        switch (position) {
            case 1: {
                Cellule celluleStockage = cellule[6][1];
                for (int i = 6; i > 0; i--) {
                    cellule[i][1] = cellule[i - 1][1];
                }
                cellule[0][1] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 2: {
                Cellule celluleStockage = cellule[6][3];
                for (int i = 6; i > 0; i--) {
                    cellule[i][3] = cellule[i - 1][3];
                }
                cellule[0][3] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 3: {
                Cellule celluleStockage = cellule[7][5];
                for (int i = 6; i > 0; i--) {
                    cellule[i][5] = cellule[i - 1][5];
                }
                cellule[0][5] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 4: {
                Cellule celluleStockage = cellule[1][6];
                for (int i = 6; i > 0; i--) {
                    cellule[1][i] = cellule[1][i - 1];
                }
                cellule[1][0] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 5: {
                Cellule celluleStockage = cellule[3][6];
                for (int i = 6; i > 0; i--) {
                    cellule[3][i] = cellule[3][i - 1];
                }
                cellule[3][0] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 6: {
                Cellule celluleStockage = cellule[5][6];
                for (int i = 6; i > 0; i--) {
                    cellule[5][i] = cellule[5][i - 1];
                }
                cellule[5][0] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 7: {
                Cellule celluleStockage = cellule[3][0];
                for (int i = 1; i < 6; i++) {
                    cellule[3][i] = cellule[3][i + 1];
                }
                cellule[3][6] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 8: {
                Cellule celluleStockage = cellule[5][0];
                for (int i = 1; i < 6; i++) {
                    cellule[5][i] = cellule[5][i + 1];
                }
                cellule[5][6] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 10: {
                Cellule celluleStockage = cellule[0][1];
                for (int i = 1; i < 6; i++) {
                    cellule[i][1] = cellule[i + 1][1];
                }
                cellule[6][1] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 11: {
                Cellule celluleStockage = cellule[0][3];
                for (int i = 1; i < 6; i++) {
                    cellule[i][3] = cellule[i + 1][3];
                }
                cellule[6][3] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            case 12: {
                Cellule celluleStockage = cellule[0][5];
                for (int i = 1; i < 6; i++) {
                    cellule[i][5] = cellule[i + 1][5];
                }
                cellule[6][5] = celluleExt;
                celluleExt = celluleStockage;
                celluleExt.affecterJoueur(celluleStockage.pionCourant);
                break;
            }
            default:
                break;
        }
    }

//    public int[] retrouverCelluleJoueur(Joueur unJoueur){
//        for(int i = 0;i<7;i++){
//            for(int j =0;j<7;j++){
//                if (cellule[i][j].pionCourant == unJoueur){
//                    // i j coordonnées de la cellule
//                }
//            }
//        }
//    }
}
