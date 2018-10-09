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
public class Mage extends Personnages{
    
    public Mage(int level, int strenght, int agility, int intel) {
        super(level, strenght, agility, intel);
    }

    @Override
    public int basicAttak() {
        return this.getIntel();
    }

    @Override
    public String getSentence() {
        return "Abracadabra je suis le mage joueur";
    }

    @Override
    public void specialAttack(Personnages defender, int attTurn, int defTurn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBasicAttackName() {
        return "Boule de Feu";
    }

    @Override
    public String getSpecialAttackName() {
        return "Soin";
    }
    
}
