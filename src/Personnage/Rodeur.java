/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnage;

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
    public void specialAttack(Personnages defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
