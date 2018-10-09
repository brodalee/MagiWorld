/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class Rodeur extends Personnages{
    
    /**
     * 
     * @param level
     * @param strenght
     * @param agility
     * @param intel
     * @throws Exception 
     */
    public Rodeur(int level, int strenght, int agility, int intel) throws Exception {
        super(level, strenght, agility, intel);
    }

    /**
     * 
     * @return int
     * Attaque Basique - Tir à l’Arc : Effectue des dommages
     * égaux à l’agilité du joueur sur l’adversaire.
     */
    @Override
    public int basicAttak() {
        return this.getAgility();
    }

    /**
     * 
     * @return String 
     * Retourne un string représentant le "cri de guerre" du personnage
     */
    @Override
    public String getSentence() {
        return "Oyé oyé chevalier je suis le Rodeur joueur";
    }

    /**
     * 
     * @param defender
     * @param attTurn
     * @param defTurn
     * Attaque Spéciale - Concentration : Le joueur gagne
     * son niveau divisé par 2 en agilité.
     */
    @Override
    public void specialAttack(Personnages defender, int attTurn, int defTurn) {
        int ag =  ((int)(this.getLevel()/2))+this.getAgility();
        try {
            this.setAgility(ag);
        } catch (Exception ex) {
            Logger.getLogger(Rodeur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 
     * @return String représentant le nom de l'attaque de base
     */
    @Override
    public String getBasicAttackName() {
        return "Tir à l’Arc";
    }

    /**
     * 
     * @return String représentant le nom de l'attaque spéciale
     */
    @Override
    public String getSpecialAttackName() {
        return "Concentration";
    }
    
}
