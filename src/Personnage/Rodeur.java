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
    
    public Rodeur(int level, int strenght, int agility, int intel) {
        super(level, strenght, agility, intel);
    }

    @Override
    public int basicAttak() {
        return this.getAgility();
    }

    @Override
    public String getSentence() {
        return "Oyé oyé chevalier je suis le Rodeur joueur";
    }

    @Override
    public void specialAttack(Personnages defender, int attTurn, int defTurn) {
        int ag =  ((int)(this.getLevel()/2))+this.getAgility();
        try {
            this.setAgility(ag);
        } catch (Exception ex) {
            Logger.getLogger(Rodeur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getBasicAttackName() {
        return "Tir à l’Arc";
    }

    @Override
    public String getSpecialAttackName() {
        return "Concentration";
    }
    
}
